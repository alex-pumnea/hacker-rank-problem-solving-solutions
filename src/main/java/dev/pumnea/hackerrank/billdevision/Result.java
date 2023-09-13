package dev.pumnea.hackerrank.billdevision;

import java.util.List;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalShouldPay = getTotalPayment(bill, k);

        int refundAmount = b - totalShouldPay;

        if (refundAmount == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(refundAmount);
        }
    }

    private static int getTotalPayment(List<Integer> bill, int k) {
        return IntStream.range(0, bill.size())
                .filter(i -> i != k)
                .map(bill::get)
                .sum() / 2;
    }
}