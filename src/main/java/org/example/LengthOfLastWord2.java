package org.example;

import java.util.Scanner;

public class LengthOfLastWord2 {

    public static void main(String[] args) {
        //solution to find the length of last string without reversing the string
        System.out.println("Hello there! enter a String: ");
        //take input from console
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("the entered string is " + s);
        int len = s.length();
        int i = 0;
        int count = 0;
        while(i<len) {
            //remove initial spaces
            while (i < len && s.charAt(i) == ' ') {
                i++;
            }
            //Initialize the counter again if there are words after the first word
            if(i < len && s.charAt(i)!= ' ' ){
                count = 0;
            }
            //count the characters of each string if found
            while (i < len && s.charAt(i) != ' ') {
                count++;
                i++;
            }
        }
        //print the last string length and exit
        System.out.println("Length of last string is " + count);
        System.exit(0);
    }

}
