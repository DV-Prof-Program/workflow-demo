package com.example;

import java.util.logging.*;

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
        Logger.getLogger("").setLevel(Level.INFO);
        logger.info("Running fib(" + n + ")");

        if (n <= 0) {
            logger.info("Error: n must be greater than 0");
            throw new IllegalArgumentException("n must be > 0");
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
        Logger.getLogger("").setLevel(Level.INFO);
        logger.info("Application startup");

        int n = 10;
        logger.info("Computing Fibonacci for n=" + n);

        int nthValue = fib(n);
        logger.info("Fibonacci result=" + nthValue);

        System.out.println("The number in position " + n + " of the Fibonacci sequence is " + nthValue + ".");
    }

    private static final Logger logger = Logger.getLogger(App.class.getName());
}
