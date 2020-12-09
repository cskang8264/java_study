package backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class no1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> input = new ArrayList<>();
        while (true) {
            input.add(br.readLine());
            if (input.contains("0")) break;
        }

        for (int i = 0; i < input.size()-1; i++) {

            String reverse = reverse(input.get(i));
            if (input.get(i).equals(reverse)) {
                bw.write("yes");
            } else {
                bw.write("no");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();


    }
    public static String reverse(String input) {
        String reserve = "";
        int size = input.length()-1;
        while (true) {
            reserve+=String.valueOf(input.charAt(size));
            size --;
            if (size < 0) break;
        }
        return reserve;
        }
}
