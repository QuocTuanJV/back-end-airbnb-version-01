package com.example.mydemo.repository;

import com.example.mydemo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findAllByIdHome(Long id);
}
