package backjoon;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class no10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String num[] =  br.readLine().split(" ");

        int index = 0;
        int[] arr = new int[N];
        while(index == num.length) {
            arr[index] = Integer.parseInt(num[index]);
            index++;
        }

        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N - 1]);
    }
}