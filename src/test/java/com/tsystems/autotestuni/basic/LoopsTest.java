package com.tsystems.autotestuni.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTest {

    @Test
    void sumOfDigits() {
        assertEquals(0, Loops.sumOfDigits(0));
        assertEquals(3, Loops.sumOfDigits(3));
        assertEquals(3, Loops.sumOfDigits(3));
        assertEquals(3, Loops.sumOfDigits(21));
        assertEquals(6, Loops.sumOfDigits(321));
        assertEquals(46, Loops.sumOfDigits(Integer.MAX_VALUE));
    }

    @Test
    void oddNumbersInRange() {
        assertEquals(0, Loops.oddNumbersInRange(0, 1));
        assertEquals(1, Loops.oddNumbersInRange(0, 2));
        assertEquals(2, Loops.oddNumbersInRange(-2, 2));
        assertEquals(999, Loops.oddNumbersInRange(-999, 999));
    }
}