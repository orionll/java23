package jep455_primitive_types_in_patterns;

public class SwitchOverLong {
    public static void main(String[] args) {
        f(Long.MAX_VALUE);
        f(Long.MIN_VALUE);
    }

    private static void f(long l) {
        switch (l) {
            case Long.MAX_VALUE -> System.out.println("MAX_VALUE");
            case Long.MIN_VALUE -> System.out.println("MIN_VALUE");
            case 0L -> System.out.println("0");
            default -> System.out.println("Other");
        }

        // Before Java 23:
        // switch (Long.valueOf(l)) {
        //     case Long x when x == Long.MAX_VALUE -> System.out.println("MAX_VALUE");
        //     case Long x when x == Long.MIN_VALUE -> System.out.println("MIN_VALUE");
        //     case Long x when x == 0L -> System.out.println("0");
        //     default -> System.out.println("Other");
        // }
    }
}
