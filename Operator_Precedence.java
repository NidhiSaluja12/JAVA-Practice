package com.company;

public class Operator_Precedence {
    public static void main(String args[])
    {
        int a = 6*5-34/2;

        /*
        30-34/2
        30-17
        13
        precedence of / = *
         */

        int b = 60/5-34*2;

        /*
        12 - 34*2
        12-68
        -34
        */

        System.out.println(a);
        System.out.println(b);

    }
}
