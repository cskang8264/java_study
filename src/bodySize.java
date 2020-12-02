import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bodySize {
    public static void main(String[] args) throws IOException {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        Person person[] = new Person[5];

        for (int i = 0; i < size; i++) {
            person[i].setCm(br.readLine());


        }



    }



    class Person {
        String cm ;
        String kg ;
        int rank = 1;

        public Person(String cm, String kg, int rank) {
            this.cm = cm;
            this.kg = kg;
            this.rank = rank;
        }

        public void setCm(String cm) {
            this.cm = cm;
        }

        public void setKg(String kg) {
            this.kg = kg;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }
    }
}
