package com.company;
import java.util.Scanner;

public class Sum_of_numbers {
    public static void main(String args[])
    {
        float sum;
        System.out.println("Enter three numbers:");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number1:");
        float a = sc.nextFloat();
        System.out.println("Enter number2:");
        float b = sc.nextFloat();
        System.out.println("Enter number3:");
        float c = sc.nextFloat();

        sum = a+b+c;

        System.out.println("Sum:"+sum);

    }

}
