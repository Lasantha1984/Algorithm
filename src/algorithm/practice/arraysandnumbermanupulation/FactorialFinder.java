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
public class FactorialFinder {
    public static void main(String[] args) {
        System.out.print("Enter the number here :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = number; i>1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial Number Is :"+factorial);
    }
}
