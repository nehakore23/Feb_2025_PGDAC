//Q11: Write a program to check if a given number is a power of 2 using bitwise operators.
//Hint: n & (n - 1) == 0 for positive numbers.


import java.io.*;
import java.util.*;

public class PowerOfTwo 
{
    public static void main(String[] args) 
	{
        int num = 16; 
        System.out.println(num + " is a power of 2? " + (num > 0 && (num & (num - 1)) == 0));
    }
}
