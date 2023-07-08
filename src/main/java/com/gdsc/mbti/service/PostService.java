package com.gdsc.mbti.service;

import com.gdsc.mbti.dto.PostRequestDto;
import com.gdsc.mbti.entity.Post;

import java.util.List;

public interface PostService {
    public List<Post> getPostList();
    public Long save(PostRequestDto requestDto);

    public String update(Long id, String content);

    public void delete(Long id);
}
