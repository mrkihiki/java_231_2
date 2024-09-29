package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void triangle() {
        assertTrue(Main.triangle(7,4,9));
        assertFalse(Main.triangle(1,2,1));
        assertFalse(Main.triangle(0,3,-3));
    }

    @Test
    void distance() {
    }

    @Test
    void powerLoop() {
    }

    @Test
    void power() {
    }

    @Test
    void tribonacci() {
    }
}