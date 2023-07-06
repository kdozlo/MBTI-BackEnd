package com.gdsc.mbti.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
@Slf4j
public class BoardController {
    @GetMapping("/{type}")
    public String getBoardList(@PathVariable("type") String type) {
        return "";
    }
    @GetMapping("/{type}/write")
    public String writeBoard(@PathVariable("type") String type) {
        return "";
    }

    @PostMapping("/{type}/write")
    public String postBoard(@PathVariable("type") String type) {
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
