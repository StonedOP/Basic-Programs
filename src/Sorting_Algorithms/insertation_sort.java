package Sorting_Algorithms;

import java.util.Arrays;

public class insertation_sort {
    public static void main(String[] args) {
        int[] arr = {1,4,6,3,9,87,5};
        insertation_SOrt(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertation_SOrt(int[] arr){
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j]= arr[j -1];
                    arr[j - 1]= temp;
                }else {
                    break;
                }

            }
        }
    }
}
