package day5;
public class Point {
      int x;
      int y;
    boolean isSameXy() {
        // x와 y가 같냐?
        return x == y;
    }
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
    }
}
