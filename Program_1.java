import java.util.*;
class Calculator {
    public double calculate(double a, double b, String op) {
        switch (op.toLowerCase()) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0)
                {
            System.out.println("Division by zero is not allowed");
                return Double.NaN;
                }
                return a / b;
            default:
                System.out.println("Invalid operation type");
                return Double.NaN;
        }
    }
}

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter type of operation (add, sub, mul, div): ");
        String operation = sc.nextLine();
        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, operation);
        System.out.println("Result: " + result);
}
}
