package com.gdsc.mbti.service;

import com.gdsc.mbti.entity.Post;
import com.gdsc.mbti.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;
    @Override
    public List<Post> getPostList() {
        return null;
    }
}
