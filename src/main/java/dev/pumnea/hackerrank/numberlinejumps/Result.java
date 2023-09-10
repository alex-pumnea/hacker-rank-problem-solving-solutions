package dev.pumnea.hackerrank.numberlinejumps;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static void main(String[] args) {
        int x1 = 43;
        int v1 = 2;
        int x2 = 70;
        int v2 = 2;
        log.info(kangaroo(x1, v1, x2, v2));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if ((x1 - x2 < 0 && v1 - v2 <= 0) || (x1 - x2) % (v1 - v2) != 0) {
            return "NO";
        }
        return "YES";
    }

}