package com.company;
import java.util.Scanner;

public class String_to_lower_case {
    public static void main (String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String a = sc.next();
        System.out.println("String in lower case is: "+a.toLowerCase());

    }
}
