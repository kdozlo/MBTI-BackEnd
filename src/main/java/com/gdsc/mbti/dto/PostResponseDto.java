package com.gdsc.mbti.dto;


import com.gdsc.mbti.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class PostResponseDto {
    private Long id;
    private String mbti;
    private String nickname;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public PostResponseDto(Post entity) {
        this.id = entity.getId();
        this.mbti = entity.getMbti();
        this.nickname = entity.getNickname();
        this.content = entity.getContent();
        this.createdAt = entity.getCreatedAt();
        this.updatedAt = entity.getUpdatedAt();
    }
}
