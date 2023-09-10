package dev.pumnea.hackerrank.breakingtherecords;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static void main(String[] args) {
        List<Integer> scores = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);
        log.info(breakingRecords(scores).toString());
    }

    /**
     * This method calculates the number of times a player breaks their own record in a game.
     * It takes a list of scores as input and returns a list containing the count of times the player
     * breaks the highest score and the count of times the player breaks the lowest score.
     *
     * @param scores the list of scores obtained by the player in the game
     * @return a list containing the count of times the player breaks the highest score and
     * the count of times the player breaks the lowest score.
     */
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int minCount = 0;
        int maxCount = 0;
        int min = scores.get(0);
        int max = scores.get(0);
        for (Integer score : scores) {
            if (score > max) {
                max = score;
                maxCount++;
            } else if (score < min) {
                min = score;
                minCount++;
            }
        }
        return List.of(maxCount, minCount);
    }


}