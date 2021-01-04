package streamstudy;

import java.util.stream.Stream;

public class StreamConcatStudy {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("java","Scala","Groovy");
        Stream<String> stream2 = Stream.of("Python","Go","Swift");
        Stream<String> concatStream = Stream.concat(stream1,stream2);
        concatStream.forEach(System.out::println);

    }
}
