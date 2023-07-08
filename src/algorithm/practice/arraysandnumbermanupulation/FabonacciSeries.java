/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.arraysandnumbermanupulation;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FabonacciSeries {
    public static void main(String[] args) {
         System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        System.out.println("Fibonacci series up to " + number + ":");
        for (int i = 0; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
       private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
