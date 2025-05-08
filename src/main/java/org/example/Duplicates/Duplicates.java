package org.example.Duplicates;

public class Duplicates {

    public static boolean hasDuplicatedValues(int[] array) {
        int steps = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                steps++;
                if (i != j && array[i] == array[j]) {
                    return true; // Dacă există duplicate, returnează true
                }
            }
        }

        System.out.println (steps);
        return false;
    }
}