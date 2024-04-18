package Sorting_Algorithms;

import java.util.Arrays;

public class cycle_sort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,1,3,5};
    //  int[] arr = {4,6,2,1,3,5,0};
        cycle_SOrt(arr);
        System.out.println(Arrays.toString(arr));
    }
    // here the array is between (1 to N) sp the (correct index) is (arr[i] - 1) or (value - 1)
    //if the array is between (0 to N) then the (correct index) is (arr[i]) or (value)
    static void cycle_SOrt(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1 ;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
