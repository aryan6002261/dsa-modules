/*
=====================================================
    MODULE 2 : MATHEMATICS FOR DSA
=====================================================

Topics:
1. Number System
2. Prime Numbers
3. Factors
4. GCD & LCM
5. Modular Arithmetic
6. Fast Exponentiation
7. Sieve of Eratosthenes
=====================================================
*/

public class Module2 {

    public static void main(String[] args) {

        // ==============================
        // Example 1 : Number System
        // ==============================

        /*
         * Convert Decimal to Binary.
         *
         * Time Complexity : O(log n)
         * Space Complexity: O(log n)
         */

        int decimal = 25;

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Decimal = " + decimal);
        System.out.println("Binary  = " + binary);



        // ==============================
        // Example 2 : Prime Number
        // ==============================

        /*
         * A prime number has exactly
         * two factors:
         * 1 and itself.
         *
         * Time Complexity : O(√n)
         * Space Complexity: O(1)
         */

        int number = 29;

        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        }

        for (int i = 2; i * i <= number; i++) {

            if (number % i == 0) {

                isPrime = false;
                break;

            }

        }

        System.out.println(number + " is Prime = " + isPrime);



        // ==============================
        // Example 3 : Factors
        // ==============================

        /*
         * Print all factors of a number.
         *
         * Time Complexity : O(√n)
         * Space Complexity: O(1)
         */

        int n = 36;

        System.out.print("Factors of " + n + " : ");

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                System.out.print(i + " ");

                if (i != n / i) {

                    System.out.print((n / i) + " ");

                }

            }

        }

        System.out.println();



        // ==============================
        // Example 4 : GCD (HCF)
        // ==============================

        /*
         * Euclidean Algorithm
         *
         * Time Complexity : O(log n)
         * Space Complexity: O(1)
         */

        int a = 48;
        int b = 18;

        int x = a;
        int y = b;

        while (y != 0) {

            int remainder = x % y;

            x = y;
            y = remainder;

        }

        int gcd = x;

        System.out.println("GCD = " + gcd);



        // ==============================
        // Example 5 : LCM
        // ==============================

        /*
         * Formula:
         *
         * LCM = (a × b) / GCD
         *
         * Time Complexity : O(log n)
         * Space Complexity: O(1)
         */

        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);



        // ==============================
        // Example 6 : Modular Arithmetic
        // ==============================

        /*
         * Frequently used to avoid
         * integer overflow.
         */

        int MOD = 1_000_000_007;

        long value1 = 1_000_000_000L;
        long value2 = 1_000_000_000L;

        long result = (value1 + value2) % MOD;

        System.out.println("Modulo Result = " + result);



        // ==============================
        // Example 7 : Fast Exponentiation
        // ==============================

        /*
         * Binary Exponentiation
         *
         * Computes base^power
         * efficiently.
         *
         * Time Complexity : O(log n)
         * Space Complexity: O(1)
         */

        int base = 2;
        int power = 10;

        long answer = 1;

        while (power > 0) {

            if ((power & 1) == 1) {

                answer *= base;

            }

            base *= base;

            power >>= 1;

        }

        System.out.println("2^10 = " + answer);



        // ==============================
        // Example 8 : Sieve of Eratosthenes
        // ==============================

        /*
         * Find all prime numbers
         * from 2 to n.
         *
         * Time Complexity :
         * O(n log log n)
         *
         * Space Complexity :
         * O(n)
         */

        int limit = 50;

        boolean[] isComposite = new boolean[limit + 1];

        System.out.print("Prime Numbers : ");

        for (int i = 2; i <= limit; i++) {

            if (!isComposite[i]) {

                System.out.print(i + " ");

                for (int j = i * i; j <= limit; j += i) {

                    isComposite[j] = true;

                }

            }

        }

        System.out.println();

    }

}

/*
=====================================================

NUMBER SYSTEM

Decimal  -> Base 10
Binary   -> Base 2
Octal    -> Base 8
Hex      -> Base 16

=====================================================

PRIME NUMBER

Prime Number:
Exactly two factors.

Examples:
2, 3, 5, 7, 11, 13...

Time Complexity:
O(√n)

=====================================================

FACTORS

Loop only till √n.

If i divides n:

Factors are:
i and (n / i)

Time Complexity:
O(√n)

=====================================================

GCD (HCF)

Greatest Common Divisor

Euclidean Algorithm

gcd(a, b)

Time Complexity:
O(log(min(a, b)))

=====================================================

LCM

LCM = (a × b) / gcd(a, b)

=====================================================

MODULAR ARITHMETIC

(a + b) % m

(a - b) % m

(a × b) % m

Common Mod Value:

1,000,000,007

=====================================================

FAST EXPONENTIATION

Also called:

Binary Exponentiation

Time Complexity:

O(log n)

=====================================================

SIEVE OF ERATOSTHENES

Find all prime numbers
up to n.

Time Complexity:

O(n log log n)

Space Complexity:

O(n)

=====================================================

BIG-O SUMMARY

Decimal to Binary      -> O(log n)

Prime Check            -> O(√n)

Factors                -> O(√n)

GCD                    -> O(log n)

LCM                    -> O(log n)

Fast Exponentiation    -> O(log n)

Sieve                  -> O(n log log n)

=====================================================
*/