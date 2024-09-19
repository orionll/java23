package jep455_primitive_types_in_patterns;

public class Range {
    public static void main(String[] args) {
        String str = switch (args.length) {
            case int i when i == 0 -> "no arguments";
            case int i when i <= 2 -> "[1; 2] arguments";
            default -> ">=3 arguments";
        };

        System.out.println(str);
    }
}
