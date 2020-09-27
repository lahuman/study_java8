package lahuman.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lahuman.four.Dish;

public class UsingStream {
    public static void main(final String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 5);
        // 고유 요소 필터링
        numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);

        System.out.println("\r------------------------");
        // 스트림 축소
        numbers.stream().filter(i -> i % 2 == 0).limit(3).forEach(System.out::println);

        System.out.println("\r------------------------");
        // 요소 건너 뛰기
        numbers.stream().filter(i -> i % 2 == 0).skip(3).forEach(System.out::println);

        System.out.println("\r------------------------");
        // 매핑
        final List<String> stringList = numbers.stream().filter(i -> i % 2 == 0).map(i -> String.valueOf(i))
                .collect(Collectors.toList());

        final List<Dish> dishList = numbers.stream().distinct().map(i -> String.valueOf(i))
                .map(s -> new Dish(s, Integer.parseInt(s))).collect(Collectors.toList());

        List<String> hellowordList = Arrays.asList("HELLO", "World").stream().map(word -> word.split(""))
                .flatMap(Arrays::stream).distinct().collect(Collectors.toList());

    }
}
