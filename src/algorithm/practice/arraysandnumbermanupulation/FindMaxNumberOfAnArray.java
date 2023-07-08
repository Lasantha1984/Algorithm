/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.arraysandnumbermanupulation;

import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FindMaxNumberOfAnArray {
    public static void main(String[] args) {
        System.out.print("Enter number sequence with comma separators : ");
        Scanner input = new Scanner(System.in);
        String sequenceOfNumber = input.next();
        String num[]= sequenceOfNumber.split(",");
        int numbers[] = convertStringArrayToIntArray(num);
        System.out.println("Max Element is : "+findMax(numbers));
    }

    private static int[] convertStringArrayToIntArray(String[] num) {
           int numArr[] = new int[num.length];
           for (int i = 0; i < num.length; i++) {
            numArr[i] = Integer.parseInt(num[i]);
            
        }
           return numArr;
    }

    private static int findMax(int[] numbers) {
         int max = 0 ;
         for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
             if (max<number) {
                 max = number;
             }
        }
         return max;
    }
}
