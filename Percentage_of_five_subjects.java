package com.company;
import java.util.Scanner;

public class Percentage {
    public static void main(String args[])
    {
        float percentage, cgpa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject1:");
        float sub1 = sc.nextFloat();
        System.out.println("Enter marks of subject2:");
        float sub2 = sc.nextFloat();
        System.out.println("Enter marks of subject3:");
        float sub3 = sc.nextFloat();
        System.out.println("Enter marks of subject4:");
        float sub4 = sc.nextFloat();
        System.out.println("Enter marks of subject5:");
        float sub5 = sc.nextFloat();
        System.out.println("Enter total marks:");
        float total = sc.nextFloat();

        percentage = ((sub1+sub2+sub3+sub4+sub5)/(total*5))*100;

        cgpa = (sub1+sub2+sub3+sub4+sub5)/50;

        System.out.println("The percentage of given marks is:"+percentage);
        System.out.println("The cgpa of given marks is:"+cgpa);
    }
}
