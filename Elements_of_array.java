package com.company;

public class Printing_an_array {
    public static void main(String args[])
    {
        int [] array = new int[5];
        array[0] = 20;
        array[1] = 10;
        array[2] = 11;
        array[3] = 50;
        array[4] = 34;

        for (int i =0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }

    }
}
