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
        assertEquals(1,Main.distance(0,0,1,0));
        assertEquals(1.4142135623730951,Main.distance(0,0,1,1));
    }

    @Test
    void powerLoop() {
        assertEquals(0.0625,Main.powerLoop(2,-4));
        assertEquals(16,Main.powerLoop(2,4));
    }

    @Test
    void power() {
        assertEquals(16,Main.powerLoop(2,4));
        assertNull(Main.power(2,-4));
    }

    @Test
    void tribonacci() {
        assertEquals(13,Main.tribonacci(7));
        assertNull(Main.tribonacci(-1));
    }
}