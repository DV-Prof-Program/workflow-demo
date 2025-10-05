package com.example;

import java.util.Scanner;
public class App {
    /**
     * Returns the nth term of the Fibonacci sequence using recursion.
     *
     * <p>This method assumes the sequence is indexed starting at 0 with:
     * <ul>
     *   <li>F(1) = 0</li>
     *   <li>F(2) = 1</li>
     * </ul>
     *
     * @param n the position in the Fibonacci sequence to return; cannot be <= 0
     * @return the nth Fibonacci number (for n >= 1)
     * @throws IllegalArgumentException if n &lt;<= 0
     */
    public static int fib(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be >= 1");
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the position in the Fibonacci sequence: ");
        //int n = sc.nextInt();
        int n = 10;
        int nthValue = fib(n);
        System.out.println("The number in position " + n + " of the Fibonacci sequence is " + nthValue + ".");
    }
}
