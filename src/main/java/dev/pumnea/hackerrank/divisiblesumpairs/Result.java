package dev.pumnea.hackerrank.divisiblesumpairs;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.IntStream;

@Slf4j
class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        List<Integer> ar = List.of(1, 3, 2, 6, 1, 2);
        log.info(String.valueOf(divisibleSumPairs(n, k, ar)));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int[] remainderCounts = new int[k];
        IntStream.range(0, n).forEach(i -> remainderCounts[ar.get(i) % k]++);

        int pairCount = (remainderCounts[0] * (remainderCounts[0] - 1)) / 2;

        int upperBound = k % 2 == 0 ? k / 2 : (k + 1) / 2;
        pairCount += IntStream.range(1, upperBound).map(i -> remainderCounts[i] * remainderCounts[k - i]).sum();

        if (k % 2 == 0) {
            pairCount += remainderCounts[k / 2] * (remainderCounts[k / 2] - 1) / 2;
        }

        return pairCount;
    }

}