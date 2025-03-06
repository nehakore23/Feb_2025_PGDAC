//: Write a Java program that checks whether a character is uppercase, lowercase, or not a letter using only the ternary operator.

import java.io.*;
import java.util.*;

public class Que19{
    public static void main(String[] args) {
        char ch = 'A'; // Change this value to test different characters

        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : 
                        (ch >= 'a' && ch <= 'z') ? "Lowercase" : 
                        "Not a letter";

        System.out.println("The character is: " + result);
    }
}
