package org.example;

import java.util.Arrays;

public class RemoveElementsFromSortedArray {
    public static void main(String[] args){
        System.out.println("Remove duplicate elements from Sorted Array and return count of array");
        char[] chars = {'a', 'a', 'b', 'd', 'd', 'e', 'f', 'f'};

        System.out.println("Length of the array before removing duplicates " + chars.length);

        System.out.println("Length of the array after removing duplicates" + removeDupFromSortedArray(chars));
        //the elements are present at the end of the array, this can be copied to new array upto the count of the updated array,
        //but not shown below
        System.out.println("After removal of duplicates array is " + Arrays.toString(chars));
    }

    private static int removeDupFromSortedArray(char[] chars) {
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && chars[i] == chars[i + 1])
                continue;
            chars[count] = chars[i];
            count++;
        }
        return count;
    }
}
