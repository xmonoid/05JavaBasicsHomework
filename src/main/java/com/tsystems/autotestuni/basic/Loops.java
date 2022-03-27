package com.tsystems.autotestuni.basic;

public class Loops {

    /**
     * Implement the method to calculate the sum of digits of the number;
     * Expect that the input number is non-negative.
     *
     * 321 -> 3 + 2 + 1 == 6
     *
     * @param number non-negative integer
     * @return the su of digits
     */
    public static int sumOfDigits(int number) {
        int sum = 0;
        do {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        } while (number != 0);
        return sum;
    }

    /**
     * Implement a method to calculate the number of odd integers between {@code start} (inclusive)
     * and {@code end} (exclusive) values.
     *
     * {@code start} is always less than {@code end}.
     *
     * @param start left border (inclusive)
     * @param end right border (exclusive)
     * @return the number of odd integers.
     */
    public static int oddNumbersInRange(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
