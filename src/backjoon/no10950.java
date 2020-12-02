package bakcjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no10950 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("size를 입력해주세요.");
        try {
            int size = Integer.parseInt(br.readLine());
            int result[] = new int [size];
            if(size > 1000000) {
                return;
            }
            for (int i=0; i<size; i++){
                String[] number= br.readLine().split(" ");
                if(Integer.parseInt(number[0]) < 0 || Integer.parseInt(number[0]) > 1000 ||
                        Integer.parseInt(number[1]) < 0 || Integer.parseInt(number[1]) > 1000) {
                    System.out.println("입력값의 범위는 0~1000입니다.");
                    return;
                }
                result[i] = Integer.parseInt(number[0])+Integer.parseInt(number[1]);
            }
            for (int a: result
            ) {
                System.out.println(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}