package com.company;
import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String args[])
    {
        int i;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.printf("%d x %d = %d\n",N,i,N*i);
        }

    }
}
