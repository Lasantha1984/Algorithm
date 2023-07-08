/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.arraysandnumbermanupulation;

/**
 *
 * @author user
 */
public class FindTheSumOfEventElementInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12};
       int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number%2==0) {
                sum = sum+number;
            }
            
        }
        System.out.println("Sum Of The Even Number Is : "+sum);
    }
    
}
