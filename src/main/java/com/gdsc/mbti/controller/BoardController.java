package com.gdsc.mbti.controller;

import com.gdsc.mbti.dto.PostRequestDto;
import com.gdsc.mbti.entity.Post;
import com.gdsc.mbti.service.BoardService;
import com.gdsc.mbti.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
@Slf4j
public class BoardController {

    private final BoardService boardService;

    private final PostService postService;
    @GetMapping("/{type}")
    public List<Post> getBoardList(@PathVariable("type") String type) {
        return postService.getPostList();
    }
    @GetMapping("/{type}/write")
    public String writeBoard(@PathVariable("type") String type) {
        return "";
    }

    @PostMapping("/{type}/write")
    public String postBoard(@PathVariable("type") String type, @RequestBody PostRequestDto requestDto) {
        postService.save(requestDto);
        return "";
    }

    @PutMapping("/{type}")
    public String updateBoard(@PathVariable("type") String type, @RequestParam(value = "id") Long id) {
        return "";
    }

    @DeleteMapping("/{type}")
    public String deleteBoard(@PathVariable("type") String type, @RequestParam(value = "id") Long id) {
        return "";
    }
}
