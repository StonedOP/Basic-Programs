package Recursion_AND_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class arraysQuestions_Rotated_BS {
    public static void main(String[] args) {
        int[] arr = {1,4,3,56};
        int[] arr1 = {1,4,3,5,6,4,4,4,56};
        System.out.println(sorted(arr,0));
        System.out.println(linerSrc_rec(arr,56,0));
        System.out.println(ret_IndexFromArray(arr, 4,0));
        System.out.println(rec_srh_FromLast(arr,33,arr.length - 1));
        System.out.println(ret(arr1,4 ,0, new ArrayList<>())); //here i initialised list


        int[] arr3 = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rotated_BS(arr3, 8,0, arr3.length - 1));
    }


// return if the given array is sorted or not by recursion
    static boolean sorted(int[] arr, int index){
        if (index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

// find an element in the given array byr recursion
    static boolean linerSrc_rec(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || linerSrc_rec(arr, target, index + 1);
    }

    static String ret_IndexFromArray (int[] arr, int target, int index){
        if (index == arr.length){
            return "not found";
        }
        if (arr[index] == target){
            Integer ans = arr[index];
            Integer x = index;
            return "target is " + ans.toString() + " found at index " + x.toString();
        }else {
            return ret_IndexFromArray(arr, target, index + 1 );
        }
    }

    // when searching from last and returning int
    static int rec_srh_FromLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return rec_srh_FromLast(arr, target, index - 1);
        }
    }

    //if there are duplicates in the array and we r asked to get all the element = target
    // in this approch we create the static list outside the function an keep updating it inside
    static ArrayList<Integer> list = new ArrayList<>();
    static void ret_all(int[] arr, int target, int index){

        if (index == arr.length -1){
            return ;
        }
        if ( arr[index] == target){
            list.add(index);
        }
        ret_all(arr,target, index + 1);
    }

    // here we pass the list in function call so that in ever function call the
    // list will be pointing to same obj
    static ArrayList<Integer> ret(int[] arr, int target, int index, ArrayList<Integer> list){

        if (index == arr.length -1){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return ret(arr,target,index + 1,  list);
    }

            //NOT GOOD APPROCH VVI CONCEPT
//here we create the list inside the recursion function so, a new list gets created with every fun call
    static ArrayList<Integer> imp_ret_list(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length -1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        //coz we need to add the answer that is returned in every function call
//we create a new list that stores the returned value and then add that ans to the current list
// present in the funCall that is (list)
    //this will contain answers from bellow function calls
        ArrayList<Integer> ans_From_Below_Fun_Calls = imp_ret_list(arr, target, index + 1);
    //now the ans is stored so here we add the returned ans in the list of the current call
        list.addAll(ans_From_Below_Fun_Calls);
        return list;
    }

                    //ROTATED BINARY SEARCH
    static int rotated_BS(int[] arr, int target , int s, int e){
        if (s > e){
            return -1;
        }

        int mid =  s + (e - s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[s] <= arr[mid]){
            if(target <= arr[mid] && target >= arr[s]){
                return rotated_BS(arr, target, s, mid - 1);
            }
            else {
                return rotated_BS(arr,target, mid +1, e);
            }
        }
        if(target >= arr[mid] && target <= arr[e] ){
            return rotated_BS(arr, target, mid + 1, e);
        }
        return rotated_BS(arr, target, s, mid - 1);
    }
}
