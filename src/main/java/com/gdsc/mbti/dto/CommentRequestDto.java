package com.gdsc.mbti.dto;

import com.gdsc.mbti.entity.Comment;
import com.gdsc.mbti.entity.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentRequestDto {
    private String mbti;
    private String nickname;
    private String content;
    private Post post;

    @Builder
    public CommentRequestDto(String mbti, String nickname, String content, Post post) {
        this.mbti = mbti;
        this.nickname = nickname;
        this.content = content;
        this.post = post;
    }

    public Comment toEntity() {
        return Comment.builder()
                .mbti(mbti)
                .nickname(nickname)
                .content(content)
                .post(post)
                .build();
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
