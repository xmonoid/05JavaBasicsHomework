package com.tsystems.autotestuni.advanced;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SwitchCaseTest {

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
    void printBenefits() {
        SwitchCase.printBenefits(0);
        assertEquals("\t room" + System.lineSeparator(), outputStreamCaptor.toString());
        outputStreamCaptor.reset();
        SwitchCase.printBenefits(1);
        assertEquals("\t free parking" + System.lineSeparator() +
                        "\t included newspaper" + System.lineSeparator() +
                        "\t room" + System.lineSeparator()
                , outputStreamCaptor.toString());
        outputStreamCaptor.reset();
        SwitchCase.printBenefits(2);
        assertEquals("\t included breakfast" + System.lineSeparator() +
                        "\t free parking" + System.lineSeparator() +
                        "\t included newspaper" + System.lineSeparator() +
                        "\t room" + System.lineSeparator()
                , outputStreamCaptor.toString());
        outputStreamCaptor.reset();
        SwitchCase.printBenefits(3);
        assertEquals("\t included dinner for one" + System.lineSeparator() +
                        "\t included breakfast" + System.lineSeparator() +
                        "\t free parking" + System.lineSeparator() +
                        "\t included newspaper" + System.lineSeparator() +
                        "\t room" + System.lineSeparator()
                , outputStreamCaptor.toString());
    }
}