package lahuman.second;

import java.util.*;
import lahuman.Apple;

public class Farm {
    /**
     * 
     * @param inventory
     * @param color 동작 파라미터화 처리
     * @return
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Apple a1 = new Apple("red", 10);
        // Apple a2 = new Apple("red", 20);
        // Apple a3 = new Apple("green", 10);
        // Apple a4 = new Apple("green", 20);
        // Apple a5 = new Apple("blue", 10);
        // List<Apple> inventory = new ArrayList<>();
        // inventory.add(a1);
        // inventory.add(a2);
        // inventory.add(a3);
        // inventory.add(a4);
        // inventory.add(a5);

        for (Apple apple : filterGreenApples(Arrays.asList(new Apple("red", 10), new Apple("red", 20),
                new Apple("green", 10), new Apple("green", 20), new Apple("blue", 10)))) {
            System.out.println(apple);
        }

    }

}
