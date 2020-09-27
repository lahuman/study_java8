package lahuman.five;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import lahuman.four.Dish;

public class MatchStream {
    public static void main(final String[] args) {
        final List<Dish> dishList = Arrays.asList(new Dish("A", 100, true), new Dish("B", 400, false),
                new Dish("C", 300, true), new Dish("D", 500, false));
        anyMatchTest(dishList);
        allMatchTest(dishList);
        findAnyWithOptionalTest(dishList);
        reduceTest(dishList);
        rangeTest();
    }

    public static void anyMatchTest(final List<Dish> list) {
        if (list.stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu has vegetarian!");
        }
    }

    public static void allMatchTest(final List<Dish> list) {
        if (list.stream().allMatch(d -> d.getCalories() < 1000)) {
            System.out.println("Every each menu below 1000 calories.");
        }
        if (list.stream().noneMatch(d -> d.getCalories() >= 1000)) {
            System.out.println("Every each menu below 1000 calories.");
        }
    }

    public static void findAnyWithOptionalTest(final List<Dish> list) {
        final Optional<Dish> dish = list.stream().filter(Dish::isVegetarian).findAny();
        dish.ifPresent(d -> System.out.println(d.getName()));
        list.stream().filter(Dish::isVegetarian).findFirst().ifPresent(d -> System.out.println(d.getName()));
    }

    public static void reduceTest(final List<Dish> list) {
        final int sum = list.stream().map(d -> d.getCalories()).reduce(0, (a, b) -> a + b);
        System.out.println("ALL CALORIES : " + sum);
    }

    public static void rangeTest() {
        // (1,5) mean => 1~4
        IntStream.range(1, 5).forEach(System.out::println);
        int sum = IntStream.range(1, 5).reduce(0, (a, b) -> a + b);
        System.out.println("1 to 5 summary : " + sum);
    }
}
