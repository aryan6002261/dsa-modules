/*
=====================================================
    MODULE 1 : INTRODUCTION TO DSA
=====================================================

Topics:
1. What is DSA?
2. Why Learn DSA?
3. Time Complexity
4. Space Complexity
5. Big O Notation
6. Best, Average & Worst Case
7. Asymptotic Analysis
=====================================================
*/

public class Module1 {

    public static void main(String[] args) {

        // ==============================
        // Example 1 : O(1) - Constant Time
        // ==============================

        /*
         * No matter how large the input is,
         * only one operation is performed.
         *
         * Time Complexity: O(1)
         */

        int number = 10;
        System.out.println("Number = " + number);



        // ==============================
        // Example 2 : O(n) - Linear Time
        // ==============================

        /*
         * Loop runs n times.
         *
         * If n = 5 -> 5 iterations
         * If n = 100 -> 100 iterations
         *
         * Time Complexity: O(n)
         */

        int n = 5;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();



        // ==============================
        // Example 3 : O(n²) - Quadratic Time
        // ==============================

        /*
         * Outer Loop -> n
         * Inner Loop -> n
         *
         * Total = n × n
         *
         * Time Complexity: O(n²)
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                System.out.print("(" + i + "," + j + ") ");

            }

            System.out.println();
        }



        // ==============================
        // Example 4 : Two Separate Loops
        // ==============================

        /*
         * First Loop -> n
         * Second Loop -> n
         *
         * Total = n + n = 2n
         *
         * Ignore constant (2)
         *
         * Time Complexity: O(n)
         */

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();



        // ==============================
        // Space Complexity Example
        // ==============================

        /*
         * Only two variables are used.
         *
         * Space Complexity: O(1)
         */

        int a = 10;
        int b = 20;

        System.out.println(a + b);



        // ==============================
        // Space Complexity O(n)
        // ==============================

        /*
         * Array size depends on n.
         *
         * Space Complexity: O(n)
         */

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }



        // ==============================
        // Best Case Example
        // ==============================

        /*
         * Linear Search
         *
         * Searching first element.
         *
         * Time Complexity:
         * Best Case = O(1)
         */

        int[] nums = {10, 20, 30, 40, 50};

        int target = 10;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                System.out.println("Found at index " + i);

                break;
            }

        }



        // ==============================
        // Worst Case Example
        // ==============================

        /*
         * Searching last element.
         *
         * Time Complexity:
         * Worst Case = O(n)
         */

        target = 50;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                System.out.println("Found at index " + i);

                break;
            }

        }

    }

}

/*
=====================================================

BIG-O CHEAT SHEET

O(1)       -> Constant
O(log n)   -> Logarithmic
O(n)       -> Linear
O(n log n) -> Linearithmic
O(n²)      -> Quadratic
O(n³)      -> Cubic
O(2ⁿ)      -> Exponential
O(n!)      -> Factorial

=====================================================

Asymptotic Analysis

Ignore:
- Constants
- Lower Order Terms

Examples:

3n + 5        -> O(n)

10n + 100     -> O(n)

5n² + 2n + 7  -> O(n²)

1000          -> O(1)

=====================================================
*/