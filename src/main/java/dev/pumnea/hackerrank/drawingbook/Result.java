package dev.pumnea.hackerrank.drawingbook;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static void main(String[] args) {
        int n = 6;
        int p = 5;
        log.info(String.valueOf(pageCount(n, p)));
    }

    public static int pageCount(int n, int p) {
        int fromFront = p / 2;
        int fromBack = ((n % 2 == 0 && p % 2 != 0) ? (n - p + 1) : (n - p)) / 2;

        return Math.min(fromFront, fromBack);
    }
}