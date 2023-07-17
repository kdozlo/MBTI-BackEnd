package com.gdsc.mbti.dto;

import com.gdsc.mbti.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentUpdateRequestDto {
    private String content;
}
