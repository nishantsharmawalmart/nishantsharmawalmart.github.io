import java.util.Scanner;

public class Multiply {
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide two numbers as arguments.");
            }
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter A for addition or M for multiplication: ");
            String choice = scanner.nextLine().trim().toUpperCase();

            double result;
            if ("A".equals(choice)) {
                result = add(num1, num2);
            } else if ("M".equals(choice)) {
                result = multiply(num1, num2);
            } else {
                System.err.println("Invalid choice. Use 'A' or 'M'.");
                scanner.close();
                return;
            }
            scanner.close();
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
