package com.gdsc.mbti.service;

import com.gdsc.mbti.dto.PostRequestDto;
import com.gdsc.mbti.entity.Post;
import com.gdsc.mbti.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<Post> getPostList(String mbti) {
        return postRepository.findAllByMbti(mbti);
    }

    @Override
    public Long save(PostRequestDto requestDto) {
        return postRepository.save(requestDto.toEntity()).getId();
    }

    @Override
    public String update(Long id, String content) {
        postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 게시글이 없습니다.")
        );
//        postRepository.update(id, content);
        return "";
    }

    @Override
    public void delete(Long id) {
        postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 게시글이 없습니다.")
        );
        postRepository.deleteById(id);
    }
}
