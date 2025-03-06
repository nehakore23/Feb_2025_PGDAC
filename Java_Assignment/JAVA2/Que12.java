//Write a Java program to multiply a number by 8 without using * or / operators.
//Hint: Use bitwise left shift (<<).

import java.io.*;
import java.util.*;

public class Que12
{
    public static void main(String[] args) 
	{
        int num = 5; 
        System.out.println(num + " × 8 = " + (num << 3));
    }
}
