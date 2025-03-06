//Q21: Write a program that increments a number without using + or ++ operators.
//Hint: Use bitwise - (~x).


import java.io.*;
import java.util.*;

public class Que21 
{
    public static void main(String[] args) 
	{
        int num = 8; 

        int incrementedNum = -~num; 

        System.out.println("Incremented value: " + incrementedNum);
    }
}
