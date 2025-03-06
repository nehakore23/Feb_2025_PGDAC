//Write a program to check whether a given number is even or odd using only bitwiseoperators.Hint: Use n & 1 to check.


import java.io.*;
import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
       
        if ((n & 1) == 0) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }
        
        sc.close();
    }
}
