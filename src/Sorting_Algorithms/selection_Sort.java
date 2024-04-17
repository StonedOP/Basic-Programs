package Sorting_Algorithms;

import java.util.Arrays;

public class selection_Sort {
    public static void main(String[] args) {
        int [] arr = {66,5,4,3,22,8,978,6};
        selection_SOrt(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selection_SOrt(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = get_maxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }

    }
    static int get_maxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] =  arr[second];
        arr[second] = temp;
    }
}
