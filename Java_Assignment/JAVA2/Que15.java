//Implement a program to swap odd and even bits of a number using bitwise
//operators.
//Hint: Use masks: (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1

import java.io.*;
import java.util.*;


public class Que15 
{
    public static void main(String[] args) 
	{
        int num = 23; 
        int evenBits = num & 0xAAAAAAAA; 
		
        int oddBits = num & 0x55555555;  
        int swappedNum = (evenBits >> 1) | (oddBits << 1);

        System.out.println("Original number: " + num);
		
        System.out.println("Swapped number: " + swappedNum);
    }
}
