package jep482_flexible_constructor_bodies;

public class FlexibleConstructorBodies {
    public static void main(String[] args) {
        System.out.println(new Point(1, 2));
    }
}

class Point {
    final int x;
    final int y;

    Point(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Negative coordinates not allowed");
        }
        this.x = x;
        this.y = y;
        super();
    }

    @Override
    public String toString() { return "[x=" + x + ", y=" + y + "]"; }
}