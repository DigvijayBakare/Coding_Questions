package practice.java8collection.stream;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFromRandomNumbers {
    public static void main(String[] args) {
        // generating 10 random2 numbers between 0 and 5
        Random random = new Random(314L);
        List<Integer> randomInts =
                random.ints(10, 1, 5)
                        .boxed()
                        .collect(Collectors.toList());
        System.out.println("randomInts = " + randomInts);

        // stream of random2 booleans
        Random random1 = new Random(314L);
        List<Boolean> booleans =
                random1.doubles(1_000, 0d, 1d)
                        .mapToObj(rand -> rand <= 0.8) // you can tune the probability here
                        .collect(Collectors.toList());

        // Let us count the number of true in this list
        long numberOfTrue =
                booleans.stream()
                        .filter(b -> b)
                        .count();
        System.out.println("numberOfTrue = " + numberOfTrue);

        //
        Random random2 = new Random(314L);
        List<String> letters =
                random2.doubles(1_000, 0d, 1d)
                        .mapToObj(rand ->
                                rand < 0.5 ? "A" : // 50% of A
                                        rand < 0.8 ? "B" : // 30% of B
                                                rand < 0.9 ? "C" : // 10% of C
                                                        "D")  // 10% of D
                        .collect(Collectors.toList());

        Map<String, Long> map =
                letters.stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.forEach((letter, number) -> System.out.println(letter + " :: " + number));

    }
}
