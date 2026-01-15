import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // -------------------------------
        // SIMPLE CALCULATOR PROGRAM
        // -------------------------------
        // This program takes two numbers and an operator from the user
        // and performs addition, subtraction, multiplication, division, or exponentiation

        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input

        // Variables to store numbers, operator, and result
        double num1;
        double num2;
        char operator;
        double result = 0;

        // Flag to track if the operator is valid
        boolean validOperator = true;

        // Ask user for the first number
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        // Ask user for the operator
        System.out.print("Enter an operator: +, -, *, /, ^ ");
        operator = scanner.next().charAt(0); // Read first character of user input

        // Ask user for the second number
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        // Process calculation based on operator
        switch (operator) {
            case '+' -> result = num1 + num2; // Addition
            case '-' -> result = num1 - num2; // Subtraction
            case '*' -> result = num1 * num2; // Multiplication
            case '/' -> { // Division
                if (num2 == 0) { // Check for division by zero
                    System.out.println("Cannot divide by zero");
                    validOperator = false; // Invalid operation
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2); // Exponentiation

            default -> { // Handle invalid operators
                System.out.println("Invalid operator");
                validOperator = false;
            }
        }

        // If operator was valid, print the result
        if (validOperator) {
            System.out.println("Result: " + result);
        }


        scanner.close();
    }
}
