//Q22: Implement a calculator that takes two numbers and an operator (+, -, *, /) as input and prints the result using only switch-case.



import java.io.*;
import java.util.*;


public class Que22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = (num2 != 0) ? num1 / num2 : Double.NaN; break;
            default: System.out.println("Invalid operator!"); return;
        }

        System.out.println("Result: " + result);
     
    }
}
