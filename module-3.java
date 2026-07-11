/*
=====================================================
    MODULE 3 : RECURSION
=====================================================

Topics:
1. What is Recursion?
2. Base Case
3. Recursive Case
4. Call Stack
5. Print Numbers
6. Factorial
7. Fibonacci
8. Sum of N Numbers
9. Power Function
10. Reverse String
11. Tail Recursion
12. Recursive Binary Search
13. Backtracking Basics
=====================================================
*/

public class Module3 {

    public static void main(String[] args) {

        // ==============================
        // Example 1 : What is Recursion?
        // ==============================

        /*
         * Recursion is a technique where a function calls itself until a base condition is reached.
         */

        System.out.println("Factorial of 5 = " + factorial(5));



        // ==============================
        // Example 2 : Base Case
        // ==============================

        /*
         * The base case stops recursion. Without it, recursion never terminates.
         */

        System.out.println("Countdown:");
        countdown(5);
        System.out.println();



        // ==============================
        // Example 3 : Recursive Case
        // ==============================

        /*
         * The recursive case reduces the problem into a smaller version of itself.
         *
         * Time Complexity : O(n)
         * Space Complexity: O(n)
         */

        int sum = sumOfNumbers(5);
        System.out.println("Sum = " + sum);



        // ==============================
        // Example 4 : Call Stack
        // ==============================

        /*
         * Every recursive function call is stored in the call stack. Calls return in reverse order.
         */

        System.out.println("Factorial of 4 = " + factorial(4));



        // ==============================
        // Example 5 : Print Numbers
        // ==============================

        /*
         * Print numbers from 1 to N.
         *
         * Time Complexity : O(n)
         * Space Complexity: O(n)
         */

        System.out.print("Numbers : ");
        printNumbers(5);
        System.out.println();



        // ==============================
        // Example 6 : Factorial
        // ==============================

        /*
         * n! = n × (n-1)!
         *
         * Time Complexity : O(n)
         * Space Complexity: O(n)
         */

        int fact = factorial(5);
        System.out.println("Factorial = " + fact);



        // ==============================
        // Example 7 : Fibonacci
        // ==============================

        /*
         * Fibonacci Sequence:
         * 0 1 1 2 3 5 8...
         *
         * Time Complexity : O(2^n)
         * Space Complexity : O(n)
         */

        int fib = fibonacci(6);
        System.out.println("Fibonacci = " + fib);



        // ==============================
        // Example 8 : Sum of N Numbers
        // ==============================

        /*
         * Sum(n) = n + Sum(n-1)
         *
         * Time Complexity : O(n)
         * Space Complexity: O(n)
         */

        System.out.println("Sum of 10 = " + sumOfNumbers(10));



        // ==============================
        // Example 9 : Power Function
        // ==============================

        /*
         * Recursive Binary Exponentiation
         *
         * Time Complexity : O(log n)
         * Space Complexity: O(log n)
         */

        long power = power(2, 10);
        System.out.println("2^10 = " + power);



        // ==============================
        // Example 10 : Reverse String
        // ==============================

        /*
         * Reverse a string using recursion.
         *
         * Time Complexity : O(n)
         * Space Complexity: O(n)
         */

        String text = "HELLO";
        System.out.print("Reverse = ");
        reverse(text, text.length() - 1);
        System.out.println();



        // ==============================
        // Example 11 : Tail Recursion
        // ==============================

        /*
         * Recursive call is the last statement executed.
         */

        System.out.print("Tail Recursion : ");
        tailPrint(5);
        System.out.println();



        // ==============================
        // Example 12 : Binary Search
        // ==============================

        /*
         * Recursive Binary Search
         *
         * Time Complexity : O(log n) 
         * Space Complexity : O(log n)
         */

        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int index = binarySearch(arr, 0, arr.length - 1, target);
        System.out.println("Index = " + index);



        // ==============================
        // Example 13 : Backtracking
        // ==============================

        /*
         * Generate all binary strings of length 3.
         *
         * Time Complexity : O(2^n) 
         * Space Complexity : O(n)
         */

        System.out.println("Binary Strings:");
        generateBinary("", 3);

    }



    // ==============================
    // Factorial
    // ==============================

    static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);

    }



    // ==============================
    // Base Case Example
    // ==============================

    static void countdown(int n) {

        if (n == 0) {
            System.out.println("Done");
            return;
        }

        System.out.println(n);
        countdown(n - 1);

    }



    // ==============================
    // Print Numbers
    // ==============================

    static void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        printNumbers(n - 1);
        System.out.print(n + " ");

    }



    // ==============================
    // Sum of Numbers
    // ==============================

    static int sumOfNumbers(int n) {

        if (n == 0) {
            return 0;
        }

        return n + sumOfNumbers(n - 1);

    }



    // ==============================
    // Fibonacci
    // ==============================

    static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }



    // ==============================
    // Fast Power
    // ==============================

    static long power(long base, long exponent) {

        if (exponent == 0) {
            return 1;
        }

        long half = power(base, exponent / 2);

        if (exponent % 2 == 0) {
            return half * half;
        }

        return base * half * half;

    }



    // ==============================
    // Reverse String
    // ==============================

    static void reverse(String text, int index) {

        if (index < 0) {
            return;
        }

        System.out.print(text.charAt(index));
        reverse(text, index - 1);

    }



    // ==============================
    // Tail Recursion
    // ==============================

    static void tailPrint(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        tailPrint(n - 1);

    }



    // ==============================
    // Recursive Binary Search
    // ==============================

    static int binarySearch(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, right, target
        );

    }



    // ==============================
    // Backtracking Basics
    // ==============================

    static void generateBinary(String current, int n) {

        if (current.length() == n) {
            System.out.println(current);
            return;
        }

        generateBinary(current + "0", n);
        generateBinary(current + "1", n);

    }

}

/*
=====================================================

WHAT IS RECURSION?

Recursion is a programming technique where a function calls itself.
A recursive function solves a problem by breaking it into smaller versions of the same problem.

Every recursive function must have:
1. Base Case
2. Recursive Case

=====================================================

BASE CASE

The base case is the stopping condition.
When the base case is reached, the recursive calls stop.
Without a base case, the recursion never ends and causes:
StackOverflowError

Example:
factorial(0) = 1

=====================================================

RECURSIVE CASE

The recursive case is where the function calls itself using a smaller input.

Example:
factorial(5) = 5 × factorial(4)

Eventually, the input becomes small enough to reach the base case.

=====================================================

CALL STACK

Each recursive call is stored inside the Call Stack.

Example:

factorial(4)
↓
factorial(3)
↓
factorial(2)
↓
factorial(1)
↓
factorial(0)

After reaching the base case, functions return in reverse order.

Call Stack follows:
LIFO
(Last In First Out)

=====================================================

PRINT NUMBERS

Print numbers from
1 to N

Recursive Idea:

printNumbers(n-1)
then
print(n)

Time Complexity: O(n)
Space Complexity: O(n)

=====================================================

FACTORIAL

Formula:
n! = n × (n-1)!

Base Case:
0! = 1

Time Complexity: O(n)
Space Complexity: O(n)

=====================================================

FIBONACCI

Sequence:
0
1
1
2
3
5
8
13
...

Formula:
F(n) = F(n-1) + F(n-2)

Base Cases:
F(0) = 0
F(1) = 1

Time Complexity: O(2^n)
Space Complexity: O(n)

=====================================================

SUM OF N NUMBERS

Formula:
Sum(n) = n + Sum(n-1)

Base Case:
Sum(0) = 0

Time Complexity: O(n)
Space Complexity: O(n)

=====================================================

POWER FUNCTION

Recursive Binary Exponentiation

Formula:
power(x, n)

If n is even:
power(x, n) = power(x, n/2)^2

If n is odd:
x × power(x, n/2)^2

Time Complexity: O(log n)
Space Complexity: O(log n)

=====================================================

REVERSE STRING

Start from the last index and print each character recursively.

Example:

HELLO
↓
OLLEH

Time Complexity: O(n)
Space Complexity: O(n)

=====================================================

TAIL RECURSION

A recursive function where the recursive call is the last operation performed.

Example:

print(n)
tailPrint(n-1)

Some languages optimize tail recursion.
Java does NOT perform Tail Call Optimization (TCO).

Time Complexity: O(n)
Space Complexity: O(n)

=====================================================

RECURSIVE BINARY SEARCH

Works only on Sorted Arrays.

Algorithm:

Find middle element.
If target is smaller, search left half.
Otherwise, search right half.

Time Complexity: O(log n)
Space Complexity: O(log n)

=====================================================

BACKTRACKING BASICS

Backtracking is an extension of recursion.

Steps:

Choose
↓
Explore
↓
Undo (Backtrack)
↓
Choose Again

Common Problems:

• N-Queens
• Sudoku Solver
• Rat in a Maze
• Word Search
• Permutations
• Combinations
• Subsets

Typical Complexity:
O(2^n) or O(n!)
depending on the problem.

=====================================================

BIG-O SUMMARY:

Print Numbers          -> O(n)

Factorial              -> O(n)

Fibonacci              -> O(2^n)

Sum of N Numbers       -> O(n)

Power Function         -> O(log n)

Reverse String         -> O(n)

Tail Recursion         -> O(n)

Binary Search          -> O(log n)

Backtracking           -> O(2^n) or O(n!)

=====================================================
*/