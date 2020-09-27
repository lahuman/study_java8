package lahuman.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Questions {
    public static void main(String[] args) {
        firstQuestion();
        System.out.println("__________________________");
        secondQuestion();
        System.out.println("__________________________");
        threeQuestion();
    }

    public static void firstQuestion() {
        // 1,2,3,4,5 => 1,4,9,16,25

        Arrays.asList(1, 2, 3, 4, 5).stream().map(i -> i * i).forEach(System.out::println);
    }

    public static List<int[]> secondQuestion() {
        // [1,2,3],[3,4] => [(1,3), (1,4), (2,3),(2,4), (3,3), (3,4)]
        List<Integer> num1 = Arrays.asList(1, 2, 3);
        List<Integer> num2 = Arrays.asList(3, 4);

        List<int[]> pairs = num1.stream().flatMap(i -> num2.stream().map(j -> new int[] { i, j }))
                .collect(Collectors.toList());

        pairs.stream().forEach(p -> System.out.println(p[0] + ", " + p[1]));
        return pairs;
    }

    public static void threeQuestion() {
        // [1,2,3],[3,4] => [(2,4), (3,3)] - sum value division by 3
        List<Integer> num1 = Arrays.asList(1, 2, 3);
        List<Integer> num2 = Arrays.asList(3, 4);

        List<int[]> pairs = num1.stream()
                .flatMap(i -> num2.stream().filter(j -> (j + i) % 3 == 0).map(j -> new int[] { i, j }))
                .collect(Collectors.toList());
        pairs.stream().forEach(p -> System.out.println(p[0] + ", " + p[1]));
    }
}
