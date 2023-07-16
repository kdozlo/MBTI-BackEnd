package com.gdsc.mbti.controller;

import com.gdsc.mbti.dto.MbtiRequestDto;
import com.gdsc.mbti.dto.MbtiResponseDto;
import com.gdsc.mbti.dto.QuestionResponseDto;
import com.gdsc.mbti.service.MbtiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mbti")
@RequiredArgsConstructor
public class MbtiController {

    private final MbtiService service;

    @GetMapping("/questions")
    private ResponseEntity<QuestionResponseDto> getQuestions() {
        return ResponseEntity.status(HttpStatus.OK).body(new QuestionResponseDto(service.getQuestions()));
    }

    @PostMapping("/result")
    private ResponseEntity<?> getResult(@RequestBody MbtiRequestDto mbtiRequestDto) {
        List<Boolean> answer = mbtiRequestDto.checkList();
        if (answer.size() != 20) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("답변이 20개가 아닙니다!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(new MbtiResponseDto(service.getMbti(answer)));
    }
}
