package dev.pumnea.hackerrank.salesbymatch;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        return ar.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ))
                .values()
                .stream()
                .mapToInt(count -> (int) (count / 2))
                .sum();
    }

}