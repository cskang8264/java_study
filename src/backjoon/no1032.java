package backjoon;

import java.io.*;

public class no1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        String data[] = new String[size];
        for (int i = 0; i < size; i++) {
            data[i] = br.readLine();
        }

        StringBuilder result = new StringBuilder();
        String resultToString = new String();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length(); j++) {
                if (data[i].charAt(j) == data[i+1].charAt(j)) {
                    result.append(data[i].charAt(j));
                } else {
                    result.append("?");
                }
            }
        }

        System.out.println(resultToString.substring(result.length()-data[0].length()));


    }
}
