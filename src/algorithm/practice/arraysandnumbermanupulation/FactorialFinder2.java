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
public class FactorialFinder2 {
    public static void main(String[] args) {
        System.out.print("Enter the number here :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Foctorial is : "+factorial(number));
    }

    private static int factorial(int number) {
        if (number==1 ||number==0) {
            return 1;
        }
        
        return  number * factorial(number-1);
    }
    
}
