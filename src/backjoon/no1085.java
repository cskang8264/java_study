package backjoon;

import java.io.*;
import java.util.Arrays;

public class no1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int x,y,w,h=0;
        x = Integer.parseInt(input[0]);
        y = Integer.parseInt(input[1]);
        w = Integer.parseInt(input[2]);
        h = Integer.parseInt(input[3]);

        int distance[] = new int[4];
        distance[0] = x;
        distance[1] = y;
        distance[2] = w-x;
        distance[3] = h-y;
        Arrays.sort(distance);

       bw.write(String.valueOf(distance[0]));
       bw.flush();
       bw.close();


    }
}
