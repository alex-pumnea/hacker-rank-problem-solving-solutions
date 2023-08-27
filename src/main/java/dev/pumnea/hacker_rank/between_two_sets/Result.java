package dev.pumnea.hacker_rank.between_two_sets;

import java.util.List;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;
        for (int i = lcmList(a); i <= gcdList(b); i += lcmList(a)) {
            if (gcdList(b) % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }

    public static int gcdList(List<Integer> list) {
        return list.stream().reduce(0, Result::getGreatestCommonDivisor);
    }

    public static int getLowestCommonMultiple(int num1, int num2) {

        return num1 * (num2 / getGreatestCommonDivisor(num1, num2));
    }

    public static int lcmList(List<Integer> list) {

        return list.stream().reduce(1, Result::getLowestCommonMultiple);
    }

}