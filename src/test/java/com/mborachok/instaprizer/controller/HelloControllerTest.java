package com.mborachok.instaprizer.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import com.mborachok.instaprizer.service.PostCommentService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloControllerTest {

    final static int POST_ID = 1;
    final static int COMMENTS_COUNT = 5;
    final static String EXPECTED_TEXT = "Number of comments for post 1: 5";

    @InjectMocks
    public HelloController unit;

    @Mock
    public PostCommentService postCommentService;

    @Before
    public void setUp() {
        when(postCommentService.getCommentsCount(POST_ID)).thenReturn(COMMENTS_COUNT);
    }

    @Test
    public void shouldBeTrue() {
        final String indexResult = unit.index();
        assertEquals(EXPECTED_TEXT, indexResult);
    }
}