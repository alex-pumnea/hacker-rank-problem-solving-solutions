package dev.pumnea.hackerrank.countingvallyes;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        AtomicInteger seaLevel = new AtomicInteger();
        AtomicInteger valleyCount = new AtomicInteger();

        IntStream.range(0, path.length())
                .mapToObj(path::charAt)
                .forEach(step -> {
                    if (step == 'U') {
                        if (seaLevel.incrementAndGet() == 0) {
                            valleyCount.incrementAndGet();
                        }
                    } else {
                        seaLevel.decrementAndGet();
                    }
                });

        return valleyCount.get();
    }

}