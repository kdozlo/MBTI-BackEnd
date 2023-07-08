package com.gdsc.mbti.repository;

import com.gdsc.mbti.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
