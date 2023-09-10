package dev.pumnea.hacker_rank.migratory_birds;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        int mostFrequent = arr.get(0);
        Map<Integer, Integer> countOccurrences = new HashMap<>();

        for (Integer value : arr) {
            countOccurrences.put(value, countOccurrences.getOrDefault(value, 0) + 1);
        }
        int maxCount = countOccurrences.get(mostFrequent);

        for (int num : countOccurrences.keySet()) {
            if(countOccurrences.get(num) > maxCount) {
                mostFrequent = num;
                maxCount = countOccurrences.get(num);
            } else if (countOccurrences.get(num) == maxCount && num < mostFrequent) {
                mostFrequent = num;
            }
        }

        return mostFrequent;
    }

}