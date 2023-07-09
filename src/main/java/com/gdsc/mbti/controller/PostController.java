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
    @GetMapping("/{type}")
    public List<Post> getPostList(@PathVariable("type") String type) {
        return postService.getPostList(type);
    }

    @PostMapping("/{type}/write")
    public String writePost(@PathVariable("type") String type, @RequestBody PostRequestDto requestDto) {
        postService.save(requestDto);
        return "";
    }

    @PutMapping("/{type}/{id}")
    public String updatePost(@PathVariable("type") String type, @PathVariable("id") Long id, @RequestBody PostRequestDto requestDto) {
        postService.update(id, "");
        return "";
    }

    @DeleteMapping("/{type}/{id}")
    public String deletePost(@PathVariable("type") String type, @PathVariable("id") Long id) {
        postService.delete(id);
        return "";
    }
}
