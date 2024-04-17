package Sorting_Algorithms;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] ans = merge_Sort(arr);
        System.out.println(Arrays.toString(ans));

        merge_sortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] merge_Sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = merge_Sort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right =merge_Sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge (left, right);
    }
    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;

    }

//by using start(s) and end(e) variable to iterate through the array
    static void merge_sortInPlace (int[] arr, int s, int e){
        if (e - s == 1){
            return;
        }
        int mid = s + (e - s) / 2;
        merge_sortInPlace(arr, s, mid);
        merge_sortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while((i < m) && (j < e)) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
//here we update the original array where s + l make the insertion at correct position
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }

    }
}
