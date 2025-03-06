//Q13: Implement a Java program to find the absolute value of an integer using bitwise
//operators.
//Hint: mask = num >> 31; abs = (num + mask) ^ mask;


import java.io.*;
import java.util.*;

public class Que13 
{
    public static void main(String[] args) {
        int num = -10; 
        int mask = num >> 31; 
        int abs = (num + mask) ^ mask; 

        System.out.println("Absolute value of " + num + " is " + abs);
    }
}
