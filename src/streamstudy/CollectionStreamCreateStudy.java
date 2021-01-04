package streamstudy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStreamCreateStudy {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c");
        Stream<String> stream = list.stream();
        Stream<String> parallelStream = list.parallelStream(); // 병렬 처리 스트림

       stream.forEach(a -> System.out.println(a)); // -> a b c
       parallelStream.forEach(a -> System.out.println(a)); // -> b c a


    }
}
