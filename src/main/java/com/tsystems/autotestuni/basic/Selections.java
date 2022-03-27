package com.tsystems.autotestuni.basic;

public class Selections {

    /**
     * Implement a method, which based on a value given for the temperature gives the following output:
     * 1. If the temperature < 15 then output “Cold enough to wear a coat”
     * 2. If the temperature ≥ 15 but < 20 then output “Cold enough to wear a jacket”
     * 3. Otherwise, simply output “No outerwear required!”
     *
     * @param temperature temperature outside in Celsius
     * @return one of three possible strings described above
     */
    public static String whatShouldIWear(double temperature) {
        if (temperature < 15) {
            return "Cold enough to wear a coat";
        } else if (temperature < 20) {
            return "Cold enough to wear a jacket";
        } else {
            return "No outerwear required!";
        }
    }

    /**
     * Implement a method, using a switch block to print out how many days any given month has.
     * For simplicity let's not consider leap years (February has always 28 days).
     *
     * @param numberInYear number of the month in the year (1-12)
     * @return 31, 30, or 28
     */
    public static int howManyDaysInMonth(int numberInYear) {
        switch (numberInYear) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return -1;
        }
    }
}
