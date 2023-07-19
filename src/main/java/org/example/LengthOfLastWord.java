package org.example;

import java.util.Scanner;

public class LengthOfLastWord {

    public static void main(String[] args) {

        System.out.println("Hello there! enter a String: ");
        //take input from console
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("the entered string is " + s);
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        // reverse the string, so that first word can be now the last word of original string
        sb.reverse();
        int i = 0;
        int count = 0;
        //remove initial spaces
        while(i<len && sb.charAt(i) == ' ') {
            i++;
        }
        //count the characters of first string if found
        while(i<len && sb.charAt(i) != ' ') {
            count++;
            i++;
        }
        //print the last string length and exit
        System.out.println("Length of last string is " + count);
        System.exit(0);
    }

}
