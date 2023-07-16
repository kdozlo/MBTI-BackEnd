package com.gdsc.mbti.dto;

import com.gdsc.mbti.entity.Question;

import java.util.List;

public record QuestionResponseDto(List<Question> questions) {

}
