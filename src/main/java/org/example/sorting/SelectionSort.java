package org.example.sorting;

public class SelectionSort {
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length-1; i++) {
            int lowestNumberIndex = i;
            for(int j = i+1; j < array.length; j++) {
                if(array[j] < array[lowestNumberIndex]) {
                    lowestNumberIndex = j;
                }
            }

            if(lowestNumberIndex != i) {
                int temp = array[i];
                array[i] = array[lowestNumberIndex];
                array[lowestNumberIndex] = temp;
            }
        }
    }
}
