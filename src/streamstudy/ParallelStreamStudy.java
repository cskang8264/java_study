package streamstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Product {
    String name;
    int amount;

    public Product(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

public class ParallelStreamStudy {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product("맥북PRO",300),
                new Product("에어팟PRO",30),
                new Product("아이패드PRO",200),
                new Product("아이폰12PRO",150));
        //병렬스트림 생성
        Stream<Product> parallelStream =  productList.parallelStream();

        //병렬 여부 확인
        boolean isParallel = parallelStream.isParallel();
        System.out.println("isParallel = " + isParallel);
        // 각 작업을 쓰레드를 이용해 병렬 처리 됨.
        boolean isMany = parallelStream
                .map(product -> product.getAmount() * 0.1)
                .anyMatch(amount -> amount > 200);
        System.out.println("isMany = " + isMany);

        int arr[] = {1,2,3};
        Arrays.stream(arr).parallel().forEach(System.out::println);

        // 컬렉션과 배열이 아닌경우 parallel() 메서드를 이용합니다.
        IntStream intStream = IntStream.range(1, 20).parallel();
        intStream.forEach(System.out::println);
        boolean isIntStreamParallel = intStream.isParallel();
        System.out.println("[Paralleled]isIntStreamParallel = " + isIntStreamParallel);

        //다시 시퀀셜모드로 돌리고 싶다면 sequential 메서드를 사용합니다. 무조건 병렬스트림이 좋은 것은 아닙니다.
        intStream.sequential();
        System.out.println("[Sequenced]isIntStreamParallel = " + intStream.isParallel());

    }
}
