package org.example.Duplicates;

public class Duplicates2 {
    public static boolean hasDuplicates(int[] array) {
        int max = array[0];
        for(int num : array) {
            if(num > max) {
                max = num;
            }
        }

        int[] existingNumber = new int[max+1];

        for(int i = 0; i < array.length; i++) {
            if(existingNumber[array[i]] == 1) {
                return true;
            } else {
                existingNumber[array[i]] = 1;
            }
        }
        return false;
    }

}