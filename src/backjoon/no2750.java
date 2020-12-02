package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class no2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            input.add(Integer.parseInt(br.readLine()));
        }
        input.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                }
                else if (o1 < o2) {
                    return -1;
                }
                else {
                    return 0;
                }

            }
        });
        for (int i = 0; i < size; i++) {
            System.out.println(input.get(i));
        }

    }
}
