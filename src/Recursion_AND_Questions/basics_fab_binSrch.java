package Recursion_AND_Questions;

public class basics_fab_binSrch {
    public static void main(String[] args) {
        System.out.println(fibo(45));
        int[] arr = {1,3, 4, 23, 34, 45, 56};
        int target = 45;
        System.out.println(rec_BinarySrch(arr, 0, arr.length - 1, target));
    }

    // linear recurrence relation and not efficient as its repeating function calls
//dynamic programming--in the recursion call if 2 or more are doing same work don't repeat it
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n -1) + fibo(n - 2);
    }


    // this is divide and conquer recurrence relation used in binary search
    // as the search space is reduced by half

    // we will return the index
    static int rec_BinarySrch( int[] arr, int s, int e, int target){
        if (s > e ){
            return -1 ;
        }
        int mid = s + (e - s) / 2;

        if (arr[mid] == target){
            return mid;
        }
        if (arr[mid] > target){
            return rec_BinarySrch(arr, s, mid - 1, target);
        }
        return rec_BinarySrch(arr, mid + 1, e, target);
    }

}
