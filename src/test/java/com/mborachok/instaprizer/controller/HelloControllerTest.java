package com.mborachok.instaprizer.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloControllerTest {

    @InjectMocks
    public HelloController unit;

    @Test
    public void shouldBeOne() {
        assertTrue(unit.isOne(1));
    }

    @Test
    public void shouldNotBeOne() {
        assertFalse(unit.isOne(2));
    }
}