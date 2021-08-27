package com.mborachok.instaprizer.controller;

import com.mborachok.instaprizer.service.PostCommentService;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    final static int POST_ID = 1;

    @Resource
    private PostCommentService postCommentFacade;

    @GetMapping("/")
    public String index() {
        final int commentsCount = postCommentFacade.getCommentsCount(POST_ID);
        return "Number of comments for post " + POST_ID + ": " + commentsCount;
    }
}