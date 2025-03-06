//Given a student’s percentage, print “Pass” if the percentage is 40 or above; otherwise, print “Fail”, using only the ternary operator


import java.io.*;
import java.util.*;

public class Que18 {
    public static void main(String[] args) {
        int percentage = 75;

        String result = (percentage >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);
    }
}
