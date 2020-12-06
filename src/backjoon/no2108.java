package backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class no2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            input.add(Integer.parseInt(br.readLine()));
        }
        bw.write(String.valueOf(average(input)));
        bw.write("\n");
        bw.write(String.valueOf(central(input)));
        bw.write("\n");
        bw.write(String.valueOf(min(input)));
        bw.write("\n");
        bw.write(String.valueOf(range(input)));
        bw.write("\n");
        bw.flush();
        bw.close();

    }

    public static int average(List<Integer> input) {
        int amount = 0;

        for (int i = 0; i < input.size(); i++) {
            amount = amount + input.get(i);
        }
        return Math.round(amount/input.size());
    }
    public static int central(List<Integer> input) {
        input.sort((o1, o2) -> o1 > o2 ? 1 : o1 < o2 ? -1 : o1 == o2 ? 0 : -99);

        int center = input.size()/2;
        System.out.println("input => "+ input.toString());
        return input.get(center);
    }
    public static int min(List<Integer> input) {
        int result = 0;
        int temp = 0;
      if (input.size() > 1) {
          input.sort((o1, o2) -> o1 > o2 ? 1 :o1 < o2 ? -1 : o1 == o2 ? 0 : -99);

          for (int i = 0; i < input.size(); i++) {
              if (input.get(0) < input.get(i)) {
                  temp = input.get(i);
                  result = temp;
                  break;
              }
          }

      } else {
          input.sort((o1, o2) -> o1 > 02 ? 1 :o1 < o2 ? -1 : o1 == o2 ? 0 : -99);
          result = input.get(0);
      }

        return result;
    }
    public static int range(List<Integer> input) {
        input.sort((o1, o2) -> o1 > 02 ? 1 :o1 < o2 ? -1 : o1 == o2 ? 0 : -99);
        if (input.size() > 1 ) {
            if (input.get(0) < 0 && input.get(input.size()-1) >= 0)
            return Math.abs(input.get(0))+Math.abs(input.get(input.size()-1));
            else if (input.get(0) < 0 && input.get(input.size()-1) < 0)
            return Math.abs(input.get(0)) - Math.abs(input.get(input.size() - 1));
            else
            return Math.abs(input.get(input.size()-1)) - Math.abs(input.get(0));
        }else {
            return input.size()-1;
        }


    }

}
