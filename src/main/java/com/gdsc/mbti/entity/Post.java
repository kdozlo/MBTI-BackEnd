package com.gdsc.mbti.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Post extends BaseTimeEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mbti;

    private String nickname;

    private String content;

    @Builder
    public Post(String mbti, String nickname, String content) {
        this.mbti = mbti;
        this.nickname = nickname;
        this.content = content;
    }

    public void updateContent(String content) {
        this.content = content;
    }

    public void updateNickname(String nickname) {
        this.nickname = nickname;
    }

    public void updateMbti(String mbti) {
        this.mbti = mbti;
    }
}
