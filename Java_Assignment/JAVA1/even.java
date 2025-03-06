import java.io.*;
import java.util.*;

public class even
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter a number: ");
			int n=sc.nextInt();
		
		 if (n > 0 && n % 2 == 0) 
		 {
            System.out.println(n + " is a positive and even number.");
        } 
		else if (n > 0 && n % 2 != 0) 
		{
            System.out.println(n + " is a positive but odd number.");
        } 
		else if (n < 0) 
		{
            System.out.println(n + " is negative.");
        } 
		else 
		{
            System.out.println(n + " is zero.");
        }
	}
}
