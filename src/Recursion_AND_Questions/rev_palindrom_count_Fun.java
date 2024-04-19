package Recursion_AND_Questions;

public class rev_palindrom_count_Fun {
    public static void main(String[] args) {
        funBoth(5);
        System.out.println(palindrome(44));

    }

    //this will print the nums as form input till it's zero
    static void fun(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
        fun(n -1);
    }

    //this will print the nums in reverse order on fun(int n)
    static void funRev(int n){
        if(n == 0){
            return;
        }
    // coz here we are printing after calling the recursion
        //when the funRev(int n) will come out of the stack it will print
        // the value of n will be 1 coz at 0 it gets returned
        funRev(n - 1);
        System.out.println(n);
    }

    // and when we want to print both direct and rev order
    static void funBoth(int n){
        if (n < 0){
            return;
        }
        System.out.println(n);
        funBoth(n -1);
        System.out.println(n);
    }


    static int factorial (int n){
        if (n <= 1){
            return 1;
        }
        return n * factorial( n - 1);
    }

    static int sum(int n){
        if (n <=1){
            return 1;
        }
        return n + sum(n -1);
    }

    static int sumOfDigits(int n){
        if (n == 0){
            return 1;
        }
        return (n % 10) + sumOfDigits(n/10);
    }

    static int digitProduct(int n) {
        if (n == 0) {
            return 1;
        }
        return (n % 10) * digitProduct(n/10);
    }

    // concept
    static void concept(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        concept(--n);
// if we write concept(n--) means this will (<||pass the value of n||>) and then subtract
        // so its always passing then value of n
// if we write concept(--n) means this will (<||subtract the value first||>) and then pass the value

    }

// REVERSE a number
    //first method
        // here we take the variable outside the function and then update it inside the function
    static int sum = 0;
    static void rev(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n/10);
    }

//second method
    //here we create a helper function & to get  digits we use Math class
    static int rev2(int n){
        int digits =(int)(Math.log10(n) + 1);
        return helper(n , digits);
    }

    private static int  helper(int n, int digits) {
        if (n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits -1)) + helper(n/10, digits -1);
    }

    //check weather the number is palindrome
    //we use reverse function

    static boolean palindrome (int n){
        if (n < 0) {
            return false;
        }
        return n == rev2(n);
    }



//count the zeros in the number

    static int countZeros(int n){
        return helperToCountZeros(n, 0);
    }
    static int helperToCountZeros(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n % 10;
        if (rem == 0){
            return helperToCountZeros(n/10, c + 1);
        }
        return helperToCountZeros(n/10, c);
    }



// count the number of steps to reduce a number to zero
    static int stepsToReduce(int n){
        return helperToCountSteps( n, 0);
    }
    static int helperToCountSteps(int num, int step){
        if (num == 0){
            return step;
        }
        if (num % 2 == 0){
            return helperToCountSteps(num /2 , step + 1);
        }
        return helperToCountSteps(num - 1, step + 1);
    }
}
