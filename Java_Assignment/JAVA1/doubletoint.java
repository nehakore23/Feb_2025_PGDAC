//3. Write a program to convert a double valueto int using typecasting and explain the data loss.

import java.io.*;
import java.util.*;


public class doubletoint{
    public static void main(String[] args) {
        double doubleValue = 55.44;
		
        int intValue = (int) doubleValue; 
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Converted int value: " + intValue);
    }
}
