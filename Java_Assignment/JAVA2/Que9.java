//Implement a Java program that checks if a number is within a specific range (20 to
//50) without using if-else.
//Hint: Use logical AND (&&) in a print statement



import java.io.*;
import java.util.*;

public class Que9 {
    public static void main(String[] args) {
        int num = 30; 
        System.out.println("Is the number in range? " + (num >= 20 && num <= 50));
    }
}
