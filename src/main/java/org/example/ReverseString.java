package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        //Time complexity O(n)
        System.out.println("Enter a String : ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("String entered is " + str );
        char[] a = new char[str.length()];

        int j = 0;
        for(int i = str.length() - 1; i>=0;i--) {
            a[j] = str.charAt(i);
            j++;
        }
        String strrev = new String(a);
        System.out.println("Reverse of a string is " + strrev);
    }
}
