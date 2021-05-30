package com.company;
import java.util.Scanner;

public class Replace_Space_with_underscore {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your string:");
        //String a = sc.next();
        String a = "Hello Programmer!";
        String text = a.replace(" ","_");
        System.out.println("Modified string: "+text);
    }
}
