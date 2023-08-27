package dev.pumnea.hacker_rank.subarray_division;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static void main(String[] args) {
        List<Integer> s = List.of(4);
        int d = 4;
        int m = 1;
        log.info(String.valueOf(birthday(s, d, m)));
    }

    /**
     * Calculates the number of ways to distribute a given sum of chocolate bars on a birthday.
     *
     * @param s a list of integers representing the chocolate bars each friend has
     * @param d an integer representing the sum of chocolate bars that needs to be distributed
     * @param m an integer representing the number of consecutive months the sum of chocolate bars needs to be distributed
     * @return the number of ways to distribute the chocolates as per the given criteria
     */
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = 0; i < s.size() - m + 1; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += s.get(i + j);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

}