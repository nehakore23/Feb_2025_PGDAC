//: Write a program that takes three boolean inputs and prints true if at least two ofthem are true.Hint: Use logical operators (&&, ||).

import java.io.*;
import java.util.*;

public class BooleanInput 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first boolean Value: ");
        boolean a = sc.nextBoolean();
        
        System.out.print("Enter second boolean value : ");
        boolean b = sc.nextBoolean();
        
        System.out.print("Enter third boolean value : ");
        boolean c = sc.nextBoolean();

       
        boolean result = (a && b) || (b && c) || (a && c);
        
        System.out.println("At least two are true: " + result);

        
    }
}
