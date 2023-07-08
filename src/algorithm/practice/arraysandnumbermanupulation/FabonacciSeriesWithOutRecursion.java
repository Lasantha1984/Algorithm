/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.arraysandnumbermanupulation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FabonacciSeriesWithOutRecursion {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        System.out.println("Fibonacci series up to " + number + ":");
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i <= number; i++) {
            if (i<=1) {
                list.add(i);
            }else{
                list.add(list.get(i-1)+list.get(i-2));
            }
        }
        System.out.println(list);
    }
    
}
