package lahuman.second;

import java.util.*;
import lahuman.Apple;

public class Farm {
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Apple a1 = new Apple("red", 10);
        Apple a2 = new Apple("red", 20);
        Apple a3 = new Apple("green", 10);
        Apple a4 = new Apple("green", 20);
        Apple a5 = new Apple("blue", 10);
        List<Apple> inventory = new ArrayList<>();
        inventory.add(a1);
        inventory.add(a2);
        inventory.add(a3);
        inventory.add(a4);
        inventory.add(a5);

        for (Apple apple : filterGreenApples(inventory)){
            System.out.println(apple);
        }

    }

}
