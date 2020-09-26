package lahuman.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>(
                Arrays.asList(new Dish("A", 300), new Dish("B", 500), new Dish("C", 300), new Dish("D", 400)));

        listPrint(java7Example(menu), "java7");
        listPrint(java8Example(menu), "java8");

    }

    public static void listPrint(List<String> lowCaloricDishesName, String type) {
        System.out.println("*******************************");
        System.out.println(type);
        for (String s : lowCaloricDishesName) {
            System.out.println(s);
        }
        System.out.println("*******************************");
    }

    public static List<String> java8Example(List<Dish> menu) {
        List<String> lowCaloricDishesName = menu.stream().filter(d -> d.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories)).map(Dish::getName).collect(Collectors.toList());
        return lowCaloricDishesName;
    }

    public static List<String> java7Example(List<Dish> menu) {

        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish d : menu) {
            if (d.getCalories() < 400) {
                lowCaloricDishes.add(d);
            }
        }

        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            public int compare(Dish d1, Dish d2) {
                return Integer.compare(d1.getCalories(), d2.getCalories());
            }
        });

        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dish d : lowCaloricDishes) {
            lowCaloricDishesName.add(d.getName());
        }
        return lowCaloricDishesName;
    }
}
