    package Questions;

import java.util.ArrayList;
import java.util.List;


public class OnCyclic_Sort {
    public static void main(String[] args) {

    }

    static int missingNum_Arr(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
/*
the elements are between 0 to N i.e. GIVEN in Q. so correctIndex = arr[i]
if the Nth element is present the array then it will not be at index no. N because
1 element is missing SO WE ignore the nth index by checking for (< arr.length)
and swap others
*/
            if (arr[i] < arr.length && arr[i] != correctIndex) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
/*
using 1 more loop to find which no. is missing
        case 1 - when the missing no. is between the given range 0-N
        when the missing no. is less than the given 'N'
         this will check  for if
         j at 0 is = 0
         if j at 1 = 1
*/
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    // find all the missing numbers if the array is in range (1 to N)
    static List<Integer> allMissingNum(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        // to find missing number we run a for loop
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }


    // find the duplicate number if there is only one repeated number in the array (1 to N)
    static int duplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != i + 1) {
// here we check if the value at i != i + 1
//and then if that value at (i) is = to value at the correct index that means it's a duplicate element
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                }else{
                    return arr[i];
                }
            }else {
                i++;
            }
        }return -1;
    }


    // find all the duplicate in the array of (1 to N)
    static List<Integer> allDuplicates(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j +1){
                list.add(arr[j]);
            }
        }return list;
    }

//one no. is duplicated in an array by removing one form it
    // find the duplicated and missing numbers index od duplicate number + 1
    static int[] duplicate_and_missing(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i]  != arr[correctIndex]){
                swap(arr, i, correctIndex );
            }else {
                i++;
            }
        }
        // missing number will be equal to the index + 1 and duplicate will be value at that index
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1){
                return new int[]{arr[index], index +1};
            }
        }
        return new int[] {-1, -1};
    }


    // find the first positive missing number in array
    //where array contain +ve and - ve numbers
    // to extra conditions are added
    static int first_positive_missingNum(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if( arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1){
                return j + 1;
            }
        }return arr.length + 1;
    }
}