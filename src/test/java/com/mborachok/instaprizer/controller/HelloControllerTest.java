package com.mborachok.instaprizer.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

public class HelloControllerTest {

    @InjectMocks
    public HelloController unit;

    @Test
    public void shouldBeTrue() {
        assertTrue(true);
    }

    @Test
    public void shouldBeFalse() {
        assertFalse(false);
    }
}