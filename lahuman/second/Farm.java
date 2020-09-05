package lahuman.second;

import java.util.*;
import lahuman.Apple;
import lahuman.ApplePredicate;

public class Farm {
    /**
     * 
     * @param inventory
     * @param p         동작 파라미터화 처리
     * @return
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        // step 1 : 데이터 생성 & 테스트 
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

        // step 2 : 데이터 생성 & 테스트 + 익명 클래스 사용
        // for (Apple apple : filterGreenApples(Arrays.asList(
        //                                             new Apple("red", 10), 
        //                                             new Apple("red", 20),
        //                                             new Apple("green", 10), 
        //                                             new Apple("green", 20), 
        //                                             new Apple("blue", 10)), 
        //     new ApplePredicate() {
        //             public boolean test(Apple a) {
        //                 return "red".equals(a.getColor());
        //             }
        //         })) {
        //     System.out.println(apple);
        // }

        //step 3 : LAMDA 표현식 사용
        for (Apple apple : filterGreenApples(Arrays.asList(
                                                    new Apple("red", 10), 
                                                    new Apple("red", 20),
                                                    new Apple("green", 10), 
                                                    new Apple("green", 20), 
                                                    new Apple("blue", 10)), 
            (Apple apple) -> "red".equals(apple.getColor()))) {
            System.out.println(apple);
        }

    }

}
