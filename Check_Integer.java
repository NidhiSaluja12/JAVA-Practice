package com.company;
import java.util.Scanner;

public class Check_Integer {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        boolean b = sc.hasNextInt();
        System.out.println(b);

    }
}
