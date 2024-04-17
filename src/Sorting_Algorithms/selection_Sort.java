package Sorting_Algorithms;

import java.util.Arrays;

public class selection_Sort {
    public static void main(String[] args) {
        int [] arr = {66,5,4,3,22,8,978,6};
        int [] arr1 = {66,5,4,3,22,8,978,6};
        selection_SORt(arr1, arr1.length, 0, 0);
        selection_SOrt(arr);

        System.out.println(Arrays.toString(arr1));
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

    //RECURSION
    static void selection_SORt(int[] arr, int r, int c, int max){
        if (r == 0){
            return;
        }
        if (c < r){
            if(arr[c] > arr[max]){
                selection_SORt(arr, r, c + 1, c);
            }else{
                selection_SORt(arr, r, c + 1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[r -1];
            arr[r - 1] = temp;
            selection_SORt(arr, r - 1, 0, 0);
        }

    }
}
