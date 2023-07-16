package com.gdsc.mbti.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(value = EnumType.STRING)
    private QuestionType type;

    String content;
}
