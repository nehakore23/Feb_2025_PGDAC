//Write a program that determines whether a given number is positive, negative, or zero using only the ternary ope rator give simple code for it 


import java.io.*;
import java.util.*;


public class Que16 
{
    public static void main(String[] args) 
	{
        int num = -9; 

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println("The number is: " + result);
    }
}
