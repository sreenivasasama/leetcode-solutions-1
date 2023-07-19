package org.example;

import java.util.Scanner;

public class LengthOfLastWord {

    public static void main(String[] args) {

        System.out.println("Hello there! enter a String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println("the entered string is " + s);
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        boolean wordFound = false;
        int i = 0;
        int count = 0;
        while(i<len && sb.charAt(i) == ' ') {
            i++;
        }
        while(i<len && sb.charAt(i) != ' ') {
            count++;
            i++;
        }
        System.out.println("Length of last string is " + count);
        System.exit(0);
    }

}
