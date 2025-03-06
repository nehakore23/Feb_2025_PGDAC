//4. Write a program to calculate the average of three int numbers using typecasting to display the result in double.

import java.io.*;
import java.util.*;

public class Average3no
{
	public static void main(String[] args){
	 int a= 10, b = 20, c = 30; 
        double average = (double) (a + b + c ) / 3; 
		
       System.out.println("Average: " + average);
    }
}