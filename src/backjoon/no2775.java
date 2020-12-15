package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class no2775 {

    public static int[][] 아파트 = new int[15][15];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        아파트만들기();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
            sb.append(아파트[n][k]).append('\n');
        }
        System.out.println(sb);
    }


    public static void 아파트만들기() {

        for (int i = 0; i < 아파트.length; i++) {
            아파트[i][1] = 1;
            아파트[0][i] = i;
        }
        for (int i = 1; i < 아파트.length; i++) {

            for (int j = 2; j < 아파트[i].length; j++) {
                아파트[i][j] = 아파트[i][j - 1] + 아파트[i - 1][j];
            }
        }
    }

}