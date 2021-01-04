package streamstudy;

import java.util.stream.Stream;

public class SreamBuilderStudy {
    public static void main(String[] args) {
        Stream<String> builderStream =
                Stream.<String>builder()
                        .add("kang")
                        .add("kwak")
                        .add("kim")
                        .add("jo").build();
        builderStream.forEach( a -> System.out.println(a));

        Stream<String> geneatedStream =
                Stream.generate(() -> "hihi").limit(5);

        geneatedStream.forEach(a -> System.out.println(a));

        Stream<Integer> interatedStream =
                Stream.iterate(1, num -> num*2).limit(5);

        interatedStream.forEach(System.out::println); // forEach(a -> System.out.println(a)); 동일
    }
}
