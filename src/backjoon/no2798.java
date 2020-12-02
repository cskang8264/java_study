package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no2798 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        String cardNum[] = br.readLine().split(" ");
        int Numbers[] = new int[cardNum.length];
        for (int i = 0; i < cardNum.length ; i++) {
            Numbers[i] = Integer.parseInt(cardNum[i]);
        }

        for (int i = 0; i < N; i++) {
            if (Numbers[i] > M) continue;

            for (int j = i+1; j <N-2 ; j++) {

                for (int k = j+1; k < N-1; k++) {


                }

            }

        }
    }
}
