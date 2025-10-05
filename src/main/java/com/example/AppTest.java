package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testOne() {
        assertEquals(0, App.fib(1));
    }
    @Test
    void testTwo() {
        assertEquals(1, App.fib(2));
    }
    @Test
    void testTen() {
        assertEquals(34, App.fib(10));
    }
    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> App.fib(0));
    }
}