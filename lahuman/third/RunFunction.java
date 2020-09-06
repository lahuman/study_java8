package lahuman.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RunFunction{
    public static void main(String[] args){
        List<Integer> l = map(Arrays.asList("lambdas", "in", "action"), (String s) -> s.length());
        l.stream().forEach(System.out::println);
    }
    public static <T, R> List<R> map(List<T> list, java.util.function.Function<T, R> f) {
        // List<R> result = new ArrayList<>();
        // for(T s : list){
        //     result.add(f.apply(s));
        // }
        // return result;

        return list.stream().map(f::apply).collect(Collectors.toList());
    }
}