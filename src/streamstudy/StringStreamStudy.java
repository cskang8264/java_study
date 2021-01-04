package streamstudy;

import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStreamStudy {
    public static void main(String[] args) {
        IntStream charsStream =
                "Stream".chars();
        charsStream.forEach(System.out::println);

        Stream<String> stringStream =
                Pattern.compile(", ").splitAsStream("kim, kang, kwak, jo, park");
        stringStream.forEach(System.out::print);
    }
}
