import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public void calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.nextLine();

        Calculator calc = new Calculator(a, b, op);
        calc.calculate();
    }
}
