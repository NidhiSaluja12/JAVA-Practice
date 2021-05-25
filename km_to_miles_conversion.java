package com.company;
import java.util.Scanner;

public class DistanceConversion {
    public static void main(String args[])
    {
        double miles;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km:");
        double k = sc.nextDouble();

        miles = k /1.609;

        System.out.println("Distance in miles is:"+miles);




    }
}
