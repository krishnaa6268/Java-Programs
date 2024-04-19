package in.kkcoding.Challenge113;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> numbers= List.of(1,2,3,4,4,5,4,3,556,7,5);

        List<Integer> distinctResult =numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(distinctResult);
    }
}
