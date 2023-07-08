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
public class ReversingAnInteger2 {

    public static void main(String[] args) {
        System.out.print("Enter Input Here :");
        Scanner input = new Scanner(System.in);
        Integer integer = input.nextInt();
        
            int number = integer, reverse = 0;
            while (number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        
    }

}
