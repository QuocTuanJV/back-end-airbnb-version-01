package com.example.mydemo.services.impl;

import com.example.mydemo.model.Comment;
import com.example.mydemo.repository.CommentRepository;
import com.example.mydemo.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;


    @Override
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public List<Comment> getCommentByIdHome(Long id) {
        return commentRepository.findAllByIdHome(id);
    }
}
