package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++) {
            reverseString(input);
        }
        System.out.println("input: " + input);
        System.out.println("result: " + reverseString(input));
        System.out.println("1000 iterations: " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        for(int i = 0; i < 10_000; i++) {
            reverseString(input);
        }
        System.out.println("10 000 iterations: " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        for(int i = 0; i < 100_000; i++) {
            reverseString(input);
        }
        System.out.println("100 000 iterations: " + (System.currentTimeMillis() - start) + " ms");
    }

    public static StringBuilder reverseString(String input) {
        return new StringBuilder(input).reverse();
    }
}
