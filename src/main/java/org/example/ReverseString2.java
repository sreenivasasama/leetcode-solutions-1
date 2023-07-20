package org.example;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString2 {

    //Reverse string using Stack
    public static void main(String[] args){
        System.out.println("Enter a string to reverse : ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length();i++){
            stack.push(str.charAt(i));
        }
        char[] charray = new char[str.length()];
        int j = 0;
        while(!stack.empty()){
            System.out.println("char popped is " + stack.peek());
            charray[j] = stack.pop();
            j++;
        }
        String strrev = new String(charray);

        System.out.println("reverse of a string is " + strrev);
    }
}
