//package backjoon;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class no1712 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input[] = br.readLine().split(" ");
//        final int A = Integer.parseInt(input[0]);
//        int B = Integer.parseInt(input[1]);
//        int C = Integer.parseInt(input[2]);
//        int count = 1;
//
//        while (true) {
//            int amount = A+(B*count);
//            int amount2 = C*count;
//
//            if (amount < amount2) {
//                System.out.println(count);
//                break;
//            } else {
//                count++;
//            }
//
//        }
//
//    }
//}
