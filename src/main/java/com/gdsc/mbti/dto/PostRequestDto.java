package com.gdsc.mbti.dto;

import com.gdsc.mbti.entity.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostRequestDto {
    private String nickname;
    private String content;

    @Builder
    public PostRequestDto(String nickname, String content) {
        this.nickname = nickname;
        this.content = content;
    }

    public Post toEntity() {
        return Post.builder()
                .nickname(nickname)
                .content(content)
                .build();
    }
}
