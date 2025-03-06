//


import java.io.*;
import java.util.*;



public class Que23 {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
		
        int num = sc.nextInt();

        
        String result = (num & 1) == 0 ? "Even" : "Odd";

        System.out.println("The number is: " + result);


    }
}
