//Hint: Use logical AND (&&) in a print statement.
//Q10: Write a program to determine if a character is a vowel or a consonant using the
//ternary operator.

import java.io.*;
import java.util.*;

public class Que10 
{
    public static void main(String[] args) 
	{
        char ch = 'a';
		
        System.out.println(ch + " is " + 
            ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
              ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "a Vowel" : "a Consonant"));
    }
}
