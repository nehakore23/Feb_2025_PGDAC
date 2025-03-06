//: Implement a Java program that finds the minimum of four numbers using nested ternary operators.


import java.io.*;
import java.util.*;

public class Que17 
{
    public static void main(String[] args) 
	{
        int a = 10, b = 5, c = 8, d = 3; 

        int min = (a < b) ? (a < c ? (a < d ? a : d) : (c < d ? c : d))
                   : (b < c ? (b < d ? b : d) : (c < d ? c : d));

        System.out.println("The minimum number is: " + min);
    }
}
