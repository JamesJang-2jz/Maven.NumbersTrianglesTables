package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
            String evenString = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                evenString += Integer.toString(i);
            }
        } return evenString;
    }
    public static String getOddNumbers(int start, int stop) {
        String oddString = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                oddString += Integer.toString(i);
            }
        } return oddString;
    }
    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        int squared = 0;
        for (int i = start; i < stop; i += step) {
            squared = i * i;
            result += Integer.toString(squared);
        } return result;
    }
    public static String getRange(int stop) {
        String range = "";
        for (int i = 0; i < stop; i++) {
            range += Integer.toString(i);
        } return range;
    }
    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++) {
            range += Integer.toString(i);
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i += step) {
            range += Integer.toString(i);
        } return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String range = "";
        for (int i = start; i < stop; i += step) {
            range += Integer.toString((int) Math.pow(i,exponent));
        } return range;
    }
}
