import static java.io.IO.*;

public class ImplicitClass {
    public void main(String[] args) {
        var x = readln("Enter first number: ");
        var y = readln("Enter second number: ");
        println("Sum: " + (Integer.parseInt(x) + Integer.parseInt(y)));
    }
}
