package com.gdsc.mbti.service;

import com.gdsc.mbti.dto.CommentRequestDto;
import com.gdsc.mbti.dto.CommentUpdateRequestDto;
import com.gdsc.mbti.entity.Comment;
import com.gdsc.mbti.entity.Post;
import com.gdsc.mbti.repository.CommentRepository;
import com.gdsc.mbti.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    @Override
    @Transactional
    public Long save(Long id, CommentRequestDto requestDto) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 게시글이 없습니다.")
        );
        requestDto.setPost(post);
        return commentRepository.save(requestDto.toEntity()).getId();
    }

    @Override
    @Transactional
    public Long update(Long id, CommentUpdateRequestDto requestDto) {
        Comment updateComment = commentRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 댓글이 없습니다.")
        );
        updateComment.updateContent(requestDto.getContent());
        commentRepository.save(updateComment);
        return id;
    }

    @Override
    @Transactional
    public Long delete(Long id) {
        commentRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 댓글이 없습니다.")
        );
        commentRepository.deleteById(id);
        return id;
    }
}
