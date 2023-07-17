package com.gdsc.mbti.service;

import com.gdsc.mbti.dto.CommentRequestDto;
import com.gdsc.mbti.dto.CommentUpdateRequestDto;

public interface CommentService {
    public Long save(Long id, CommentRequestDto requestDto);

    public Long update(Long id, CommentUpdateRequestDto requestDto);

    public Long delete(Long id);
}
