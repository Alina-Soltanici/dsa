package org.example.Duplicates;

public class Duplicates2 {
    public static boolean findDuplicates(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        int[] existingNumbers = new int[max + 1];

        for(int i = 0; i < array.length; i++) {
            if(existingNumbers[array[i]] == 1) {
                return true;
            } else {
                existingNumbers[array[i]] = 1;
            }
        }
        return false;

    }

}