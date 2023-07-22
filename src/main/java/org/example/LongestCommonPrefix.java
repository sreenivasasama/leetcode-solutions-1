package org.example;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strings1 = {"geek", "geek for geeks" , "gee" , "geeks" , "ge", "geeks are geeks"} ;
        System.out.println("Largest common prefix in array of strings1 is " + longestCommonPrefix(strings1));
        String[] strings2 = {} ;
        System.out.println("Largest common prefix in array of strings2 is " + longestCommonPrefix(strings2));
        String[] strings3 = {"q"} ;
        System.out.println("Largest common prefix in array of strings3 is " + longestCommonPrefix(strings3));
        String[] strings4 = {"a", "a" , "a", "a"} ;
        System.out.println("Largest common prefix in array of strings4 is " + longestCommonPrefix(strings4));
        String[] strings5 = {"ab", "ba" , "ca", "a"} ;
        System.out.println("Largest common prefix in array of strings4 is " + longestCommonPrefix(strings5));
    }

    private static String longestCommonPrefix(String[] strings) {

        StringBuilder sb = new StringBuilder();
        if(strings.length == 0) {
            return sb.toString();
        }

        int minLength = strings[0].length();
        for(int i = 1; i< strings.length; i++) {
            minLength = Math.min(minLength,strings[i].length());
        }

        for(int i = 0; i<minLength;i++){
            char c = strings[0].charAt(i);
            for(String str: strings){
                if(c != str.charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
