package org.example.searching;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length-1;

        while(start <= end) {
            int midpoint = (start+end)/2;
            int midValue = array[midpoint];

            if(target == midValue) {
                return midpoint;
            } else if (target < midValue) {
                end = midpoint - 1;
            } else if(target > midValue) {
                start=midpoint+1;
            }
        }
        return -1;
    }
}
