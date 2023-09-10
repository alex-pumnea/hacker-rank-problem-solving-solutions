package dev.pumnea.hackerrank.applesandoranges;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */


    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        List<Integer> getApplesPosition = fallPosition(a, apples);
        List<Integer> getOrangePosition = fallPosition(b, oranges);
        getFeltFruitsInRangeCount(s, t, getApplesPosition);
        getFeltFruitsInRangeCount(s, t, getOrangePosition);
    }

    private static void getFeltFruitsInRangeCount(int startRange, int endRange, List<Integer> feltFruitsPosition) {
        long count = feltFruitsPosition.stream()
                .filter(pos -> pos >= startRange && pos <= endRange)
                .count();
        log.info(String.valueOf(count));
    }

    private static List<Integer> fallPosition(int position, List<Integer> positionInputs) {
        return positionInputs.stream()
                .map(apple -> position + apple)
                .toList();
    }

}