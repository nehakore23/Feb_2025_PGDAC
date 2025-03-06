//Q20: Implement a Java program that returns the absolute value of a given number using the ternary operator (without using Math.abs()).


import java.io.*;
import java.util.*;

public class Que20 {
    public static void main(String[] args) {
        int num = -53; 

        int absValue = (num < 0) ? -num : num;

        System.out.println("Absolute value: " + absValue);
    }
}
