package com.gdsc.mbti.controller;

import com.gdsc.mbti.dto.PostRequestDto;
import com.gdsc.mbti.entity.Post;
import com.gdsc.mbti.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final PostService postService;
    @GetMapping("/{mbti}")
    public List<Post> getPostList(@PathVariable("mbti") String mbti) {
        return postService.getPostList(mbti);
    }

    @PostMapping("/{mbti}/write")
    public String writePost(@PathVariable("mbti") String mbti, @RequestBody PostRequestDto requestDto) {
        postService.save(requestDto);
        return "";
    }

    @PutMapping("/{mbti}/{id}")
    public String updatePost(@PathVariable("mbti") String mbti, @PathVariable("id") Long id, @RequestBody PostRequestDto requestDto) {
        postService.update(id, "");
        return "";
    }

    @DeleteMapping("/{mbti}/{id}")
    public String deletePost(@PathVariable("mbti") String mbti, @PathVariable("id") Long id) {
        postService.delete(id);
        return "";
    }
}
