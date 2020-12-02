package Chapter5;

public class SuperTest2 {
    public static void main(String[] args) {

    }
}
class Point {

    int x;
    int y;

    String getlocation() {
        return "x : "+x+", y : " +y;
    }
}
class Point3D extends  Point {
    int z;
}

