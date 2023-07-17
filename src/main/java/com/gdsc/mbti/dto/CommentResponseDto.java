package com.gdsc.mbti.dto;

import com.gdsc.mbti.entity.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CommentResponseDto {
    private Long id;
    private String mbti;
    private String nickname;
    private String content;
    private Long postId;


    public CommentResponseDto (Comment comment) {
        this.id = comment.getId();
        this.mbti = comment.getMbti();
        this.nickname = comment.getNickname();
        this.content = comment.getContent();
        this.postId = comment.getPost().getId();
    }
}
