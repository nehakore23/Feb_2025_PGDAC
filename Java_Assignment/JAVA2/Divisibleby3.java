//Write a program to find whether a given number is divisible by 3 without using themodulus (%) or division (/) operators.Hint: Use subtraction and bitwise shifts

import java.io.*;
import java.util.*;


public class Divisibleby3 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num > 3) 
		{
            num = num - 3; 
        }

        if (num == 0 || num == 3) 
		{
            System.out.println("The number is divisible by 3.");
        } else {
            System.out.println("The number is not divisible by 3.");
        }
    }
}
