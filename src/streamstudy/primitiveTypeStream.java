package streamstudy;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class primitiveTypeStream {
    public static void main(String[] args) {


        IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]
        LongStream longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]
        Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed(); // 박싱사용
        DoubleStream doubles = new Random().doubles(3); //  Double형 난수 3개 생성

        intStream.forEach(System.out::print);
        System.out.println();
        longStream.forEach(System.out::print);
        System.out.println();
        boxedIntStream.forEach(System.out::print);
        System.out.println();
        doubles.forEach(System.out::print);

    }
}
