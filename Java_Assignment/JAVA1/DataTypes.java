//1. Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.



import java.io.*;
import java.util.*;

public class DataTypes {
    
  byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
      
        byte byteValue = 10;
        short shortValue = 100;
        int intValue = 1000;
        long longValue = 10000L;
        float floatValue = 10.5f;
        double doubleValue = 20.99;
        char charValue = 'A';
        boolean booleanValue = true;

       
        DataTypes obj = new DataTypes();
        
        System.out.println("Default values:");
        System.out.println("byte: " + obj.b);
        System.out.println("short: " +obj. s);
        System.out.println("int: " + obj.i);
        System.out.println("long: " +obj. l);
        System.out.println("float: " +obj. f);
        System.out.println("double: " + obj.d);
        System.out.println("char: '" + obj.c + "'"); 
        System.out.println("boolean: " +obj. bool);

        System.out.println("\nAssigned values:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
    }
}
