//Q5: Write a Java program to swap two numbers using the += and -= operators only.


import java.io.*;
import java.util.*;


 class SwapNo {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a += b; 
        b = a - b; 
        a -= b; 

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
