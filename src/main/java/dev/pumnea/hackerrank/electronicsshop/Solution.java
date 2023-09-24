package dev.pumnea.hackerrank.electronicsshop;

import java.util.Arrays;

public class Solution {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int i = 0;
        int j = drives.length - 1;
        int greatestSum = -1;

        while (i < keyboards.length && j >= 0) {
            int sum = keyboards[i] + drives[j];
            if (sum > b) {
                j--;
            } else {
                greatestSum = Math.max(greatestSum, sum);
                i++;
            }
        }
        return greatestSum;
    }
}