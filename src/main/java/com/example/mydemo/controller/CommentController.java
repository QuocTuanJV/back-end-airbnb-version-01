package com.example.mydemo.controller;

import com.example.mydemo.message.response.ResponseMessage;
import com.example.mydemo.model.Comment;
import com.example.mydemo.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/comment/add-comment")
    public ResponseEntity<?> addComment(@RequestBody Comment comment){
        commentService.saveComment(comment);
        return new ResponseEntity<>(new ResponseMessage("add comment success"), HttpStatus.OK);
    }

    @GetMapping("/comment/get-comment")
    public ResponseEntity<?> getComment(@RequestParam Long id){
        List<Comment> comments = commentService.getCommentByIdHome(id);
        return new ResponseEntity<List<Comment>>(comments, HttpStatus.OK);
    }
}
