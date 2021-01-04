package streamstudy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//map 메서드를 사용하면 단일 스트림 안의 요소를 원하는 특정 형태로 변환할 수 있습니다.
// :: 문법은 메서드 레퍼런스를 직접 전달 할수있게 하는 문법이다
class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
public class MapMethodTest {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("kang",26),new Person("kwak",26));

        Set<String> names = personList.stream()
                .map(Person::getName)
                .collect(Collectors.toSet());

        names.forEach(name -> System.out.println(name));
    }
}
