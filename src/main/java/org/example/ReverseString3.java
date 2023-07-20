package org.example;

import java.util.Scanner;

public class ReverseString3 {

    //Reverse string using simple StringBuilder

    public static void main(String[] args){

        System.out.println("Enter a String: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        StringBuilder stringBuilder = new StringBuilder(str);

        System.out.println("reverse of a string is " + stringBuilder.reverse());

    }
}
