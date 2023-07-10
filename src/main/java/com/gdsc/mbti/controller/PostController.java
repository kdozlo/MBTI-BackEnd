package com.gdsc.mbti.controller;

import com.gdsc.mbti.dto.PostRequestDto;
import com.gdsc.mbti.dto.PostResponseDto;
import com.gdsc.mbti.dto.PostUpdateRequestDto;
import com.gdsc.mbti.entity.Post;
import com.gdsc.mbti.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final PostService postService;
    @GetMapping("/{mbti}")
    public List<PostResponseDto> getPostList(@PathVariable("mbti") String mbti) {
        List<Post> postList =  postService.getPostList(mbti);
        return postList.stream().map(PostResponseDto::new).collect(Collectors.toList());
    }

    @GetMapping("/{mbti}/{id}")
    public PostResponseDto getPost(@PathVariable("mbti") String mbti, @PathVariable("id") Long id) {
        return postService.getPost(id);
    }

    @PostMapping("/{mbti}/write")
    public Long writePost(@PathVariable("mbti") String mbti, @RequestBody PostRequestDto requestDto) {
        return postService.save(requestDto);
    }

    @PutMapping("/{mbti}/{id}")
    public Long updatePost(@PathVariable("mbti") String mbti, @PathVariable("id") Long id, @RequestBody PostUpdateRequestDto requestDto) {
        return postService.update(id, requestDto);
    }

    @DeleteMapping("/{mbti}/{id}")
    public Long deletePost(@PathVariable("mbti") String mbti, @PathVariable("id") Long id) {
        return postService.delete(id);
    }
}
