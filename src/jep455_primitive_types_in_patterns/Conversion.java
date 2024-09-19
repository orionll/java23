package jep455_primitive_types_in_patterns;

public class Conversion {
    public static void main(String[] args) {
        fits(100);
        fits(10000);
        fits(1000000);

        System.out.println(isInteger(1.0));
        System.out.println(isInteger(1.5));
    }

    private static void fits(int i) {
        switch (i) {
            case byte b -> System.out.println("byte: " + b);
            case short s -> System.out.println("short: " + s);
            default -> System.out.println("int: " + i);
        }

        // Before Java 23:
        // if (i >= Byte.MIN_VALUE && i <= Byte.MAX_VALUE) {
        //     byte b = (byte) i;
        //     System.out.println("byte: " + b);
        // } else if (i >= Short.MIN_VALUE && i <= Short.MAX_VALUE) {
        //     short s = (short) i;
        //     System.out.println("short: " + s);
        // } else {
        //     System.out.println("int: " + i);
        // }
    }

    private static boolean isInteger(double d) {
        return d instanceof long;

        // Before Java 23:
        // return d == (long) d
    }
}
