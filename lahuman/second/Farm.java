package lahuman.second;

import java.util.*;
import lahuman.Apple;
import lahuman.Predicate;

public class Farm {
    /**
     * 
     * @param list
     * @param p         동작 파라미터화 처리
     * @return
     */
    public static <T> List<T> filterGreenApples(final List<T> list, final Predicate<T> p) {
        final List<T> result = new ArrayList<>();
        for (final T apple : list) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(final String[] args) {

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
        for (final Apple apple : filterGreenApples(Arrays.asList(
                                                    new Apple("red", 10), 
                                                    new Apple("red", 20),
                                                    new Apple("green", 10), 
                                                    new Apple("green", 20), 
                                                    new Apple("blue", 10)), 
            (final Apple apple) -> "red".equals(apple.getColor()))) {
            System.out.println(apple);
        }

        // Stream 이용
        System.out.println("---------------------------------------------------");
        final List<Apple> items = Arrays.asList(
                new Apple("red", 10), 
                new Apple("red", 20),
                new Apple("green", 10), 
                new Apple("green", 20), 
                new Apple("blue", 10));
     
        items.sort((final Apple a1, final Apple a2) -> a1.compareTo(a2.getWeight()) );
                // .sort(new Comparator<Apple>() {
                //         @Override
                //         public int compare(Apple arg0, Apple arg1) {
                //             return arg0.getWeight() - arg1.getWeight();
                //         }
                // })

        items.stream()
            // .filter(person -> person.getWeight() == 10)
            .forEach(System.out::println);
    }

}
