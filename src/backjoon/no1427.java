package backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class no1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        Integer [] data =  new Integer[input.length()];
        for (int i = 0; i < input.length(); i++) {
            data[i] =  Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        Arrays.sort(data, Collections.reverseOrder());
        for (int a: data ) {
            bw.write(String.valueOf(a));
        }
        bw.flush();
        bw.close();

    }
}
