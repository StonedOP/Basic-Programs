package Sorting_Algorithms;

import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;

public class bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,9,78,6,55,43,22};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 ={1,3,2,9,78,6,55,43,22};
        rec_bubbleSort(arr1, arr1.length -1 , 0);
        System.out.println(Arrays.toString(arr1));
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j -1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    // we have to check every element so take r = length of the array and c as 0
    // we check 2 elements and put them on correct place
    //return when r is 0
    static void rec_bubbleSort(int[] arr, int r, int c){
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[c + 1]){

                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            rec_bubbleSort(arr, r, c + 1);

        }else{
            rec_bubbleSort(arr, r - 1, 0);
        }
    }
}
