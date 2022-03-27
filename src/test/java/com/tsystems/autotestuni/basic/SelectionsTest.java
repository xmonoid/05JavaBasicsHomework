package com.tsystems.autotestuni.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionsTest {

    @Test
    void whatShouldIWear() {
        assertEquals("Cold enough to wear a coat", Selections.whatShouldIWear(0.0));
        assertEquals("Cold enough to wear a jacket", Selections.whatShouldIWear(15.0));
        assertEquals("No outerwear required!", Selections.whatShouldIWear(20.0));
    }

    @Test
    void howManyDaysInMonth() {
        int[] longs = {1, 3, 5, 7, 8, 10, 12};
        for (int i : longs) {
            assertEquals(31, Selections.howManyDaysInMonth(i));
        }
        int[] shorts = {4, 6, 9, 11};
        for (int i : shorts) {
            assertEquals(30, Selections.howManyDaysInMonth(i));
        }
        assertEquals(28, Selections.howManyDaysInMonth(2));
    }
}