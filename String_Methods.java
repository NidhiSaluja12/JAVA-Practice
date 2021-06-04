package com.company;

public class String_Methods {
    public static void main(String args[])
    {
        String a = "Java Programming";
        int length = a.length();
        System.out.println(length);
        String lower_case = a.toLowerCase();
        System.out.println(lower_case);
        String upper_case = a.toUpperCase();
        System.out.println(upper_case);
        System.out.println(a.startsWith("Ja"));
        System.out.println(a.endsWith("ja"));
        System.out.println(a.charAt(2)); // at index 2
        System.out.println(a.indexOf("a"));
        System.out.println(a.replace("a", "va"));
        System.out.println(a.replace('J','S'));
        System.out.println(a.substring(2)); // 2 to end
        System.out.println(a.substring(2,4)); // 2 to 3


        String nonTrimmedString = "    Java Programming    ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
