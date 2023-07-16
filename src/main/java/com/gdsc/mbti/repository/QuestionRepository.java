package com.gdsc.mbti.repository;

import com.gdsc.mbti.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findAll();
}
