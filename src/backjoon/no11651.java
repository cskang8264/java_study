package backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class no11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        List<Point> data = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String input[] = br.readLine().split(" ");
            data.add(new Point(Integer.parseInt(input[0]),Integer.parseInt(input[1])));
        }
        data.sort((o1, o2) -> {
            if (o1.getY() > o2.getY()) return 1;
            else if(o1.getY() < o2.getY())return -1;
            else {
                if (o1.getX() > o2.getX()) {
                    return 1;
                } else if (o1.getX() < o2.getX()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (Point p: data) {
            bw.write(String.valueOf(p.getX() +" "+p.getY()));
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

}

