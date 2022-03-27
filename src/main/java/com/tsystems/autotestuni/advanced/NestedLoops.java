package com.tsystems.autotestuni.advanced;

public class NestedLoops {

    /**
     * Implement a method which will output the following pattern:
     * (1,1)(1,2)(1,3)(1,4)
     * (2,1)(2,2)(2,3)(2,4)
     * (3,1)(3,2)(3,3)(3,4)
     * (4,1)(4,2)(4,3)(4,4)
     * (5,1)(5,2)(5,3)(5,4)
     * according to {@code rows} and {@code cols} values 5 and 4 respectively.
     *
     * If one of the parameters is not more than zero, print nothing out.
     *
     * @param rows number of rows
     * @param cols number of columns
     */
    public static void printMatrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("(" + (i+1) + "," + (j+1) + ")");
            }
            System.out.println();
        }
    }

    /**
     * I want to output the following pattern:
     *
     * A1 A2 A3 A4 A5 A6 A7 A8 A9 A10
     * B1 B2 B3 B4 B5 B6 B7 B8 B9 B10
     * C1 C2 C3 C4
     *
     * Implement a method to print the pattern out using a nested {@code for} loop and
     * a {@code break} that breaks out of the loop to the end of the labeled block that it is in.
     * Outside/after the end of the labeled block, print out {@code “Just saw a C5”} on a new line.
     */
    public static void printPatternWithLabels() {
        String[] abc = { "A", "B", "C" };
        POINT_A:
        for (String s : abc) {
            for (int j = 1; j <= 10; j++) {
                String letterWithIndex = String.format("%s%d", s, j);
                if (letterWithIndex.equals("C5")) break POINT_A;
                System.out.print(letterWithIndex);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(System.lineSeparator() +"Just saw a C5");
    }
}
