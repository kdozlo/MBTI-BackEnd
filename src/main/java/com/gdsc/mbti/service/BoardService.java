package com.gdsc.mbti.service;

public interface BoardService {
    public String getPostList();

    public String savePost(String content, String uid);

    public String updatePost(Long id, String content);

    public String deletePost(Long id);

}
