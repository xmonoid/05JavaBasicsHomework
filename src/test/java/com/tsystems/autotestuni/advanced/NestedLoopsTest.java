package com.tsystems.autotestuni.advanced;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NestedLoopsTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void printMatrix() {
        outputStreamCaptor.reset();
        NestedLoops.printMatrix(0, 3);
        assertEquals("", outputStreamCaptor.toString());
        NestedLoops.printMatrix(3, 0);
        assertEquals("", outputStreamCaptor.toString());
        NestedLoops.printMatrix(5, 6);
        assertEquals("(1,1)(1,2)(1,3)(1,4)(1,5)(1,6)" + System.lineSeparator() +
                        "(2,1)(2,2)(2,3)(2,4)(2,5)(2,6)" + System.lineSeparator() +
                        "(3,1)(3,2)(3,3)(3,4)(3,5)(3,6)" + System.lineSeparator() +
                        "(4,1)(4,2)(4,3)(4,4)(4,5)(4,6)" + System.lineSeparator() +
                        "(5,1)(5,2)(5,3)(5,4)(5,5)(5,6)" + System.lineSeparator(),
                outputStreamCaptor.toString());
    }

    @Test
    void printPatternWithLabels() {
        outputStreamCaptor.reset();
        NestedLoops.printPatternWithLabels();
        assertEquals("A1 A2 A3 A4 A5 A6 A7 A8 A9 A10 " + System.lineSeparator() +
                "B1 B2 B3 B4 B5 B6 B7 B8 B9 B10 " + System.lineSeparator() +
                "C1 C2 C3 C4 " + System.lineSeparator() +
                "Just saw a C5", outputStreamCaptor.toString().trim());
    }
}