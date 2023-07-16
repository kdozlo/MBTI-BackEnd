package com.gdsc.mbti.service;

import com.gdsc.mbti.entity.Mbti;
import com.gdsc.mbti.entity.Question;
import com.gdsc.mbti.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MbtiService {
    private final QuestionRepository repository;

    public List<Question> getQuestions() {
        return repository.findAll();
    }

    public Mbti getMbti(List<Boolean> answers) {
        String mbti = "";
        String[] types = {"EI", "NS", "TF", "PJ"};

        for (int i = 0; i < 4; i++) {
            int numOfTrue = 0;
            for (int j = 5 * i; j < 5 * i + 5; j++) {
                if(answers.get(j)) {
                    numOfTrue++;
                }
            }

            if (numOfTrue > 2) {
                mbti = mbti.concat(String.valueOf(types[i].charAt(0)));
            } else {
                mbti = mbti.concat(String.valueOf(types[i].charAt(1)));
            }
        }

        return Mbti.valueOf(mbti);
    }
}
