package objectClass;

public class Student {
    String name;
    String number;
    int birthYear;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        return result;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "강대원";
        s1.number = "1234";
        s1.birthYear = 1995;


        Student s2 = new Student();
        s2.name = "김유완";
        s2.number  = "1234";
        s2.birthYear = 1995;

        if (s1.equals(s2))
            System.out.println("s1==s2");
        else
            System.out.println("s1!=s2");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

}
