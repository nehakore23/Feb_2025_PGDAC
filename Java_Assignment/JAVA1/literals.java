//Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.

import java.io.*;
import java.util.*;


public class literals 
{
	
    public static void main(String[] args) 
	{
		
        int binary = 0b1010;  
        int octal = 012;      
        int hex = 0xA;        
        float f = 10.5f;      
        double d = 20.99;     

        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
    }
}
