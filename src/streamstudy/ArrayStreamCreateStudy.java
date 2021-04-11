package streamstudy;

import java.util.Arrays;
import java.util.stream.Stream;
// 1일 1커밋이용ㄷ~
public class ArrayStreamCreateStudy {
    public static void main(String[] args) {
        String[] arr = new String[]{"a","b","c"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> streamOfArrayPart =
                    Arrays.stream(arr,1,3);

        stream.forEach(instance ->
                System.out.println("instance => "+instance));

        streamOfArrayPart.forEach(ArrayPartInstance ->
                System.out.println("ArrayPartInstance => "+ArrayPartInstance));

        // rebase test branch2 변경사항1
        // rebase test branch2 변경사항2
        // rebase test branch2 변경사항3
    }
}
