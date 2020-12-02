package backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class no2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
            bw.write(String.valueOf(input.get(i)));
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }
}
