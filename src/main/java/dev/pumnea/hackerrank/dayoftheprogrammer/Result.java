package dev.pumnea.hackerrank.dayoftheprogrammer;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        if (year == 1918) return "26.09.1918";
        if (isLeap(year)) return "12.09." + year;
        else return "13.09." + year;
    }

    private static boolean isLeap(int year) {
        if (year > 1918) {
            // Gregorian calendar
            return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        } else {
            // Julian calendar
            return (year % 4 == 0);
        }
    }

}