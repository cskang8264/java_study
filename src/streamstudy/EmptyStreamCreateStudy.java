package streamstudy;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmptyStreamCreateStudy {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c");
        Stream<String> stream = streamOf(list);

        List<String> emptyList = Arrays.asList();
        Stream<String> emptyStream = streamOf(emptyList);

        stream.forEach(a -> System.out.println(a.getClass()));
        System.out.println(emptyStream.equals(emptyList.stream()) ? "true" : "false");

    }

    public static Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty()
                ? Stream.empty()
                : list.stream();
    }
}

