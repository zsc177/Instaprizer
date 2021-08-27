package com.mborachok.instaprizer.service.imp;

import com.mborachok.instaprizer.service.PostCommentService;

import org.springframework.stereotype.Service;

@Service
public class PostCommentServiceImpl implements PostCommentService {

    @Override
    public int getCommentsCount(final int postId) {
        return 5;
    }

}
