package com.company;

public class Printing_elements_of_array_in_reverse_order {
    public static void main(String args[])

    {

        int [] array = new int[5];
        array[0] = 20;
        array[1] = 10;
        array[2] = 11;
        array[3] = 50;
        array[4] = 34;

        for (int i = array.length-1; i>=0; i-- )
        {
            System.out.println(array[i]);
        }
    }
}

