//: Write a program to find the largest of three numbers using only the ternary operator(? :).

import java.io.*;
import java.util.*;


public class TernaryOpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        
        System.out.println("The largest number is: " + largest);
        
        sc.close();
    }
}
