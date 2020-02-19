package com.example.mydemo.services;

import com.example.mydemo.model.Comment;

import java.util.List;

public interface CommentService {
    void saveComment(Comment comment);

    List<Comment> getCommentByIdHome(Long id);
}
