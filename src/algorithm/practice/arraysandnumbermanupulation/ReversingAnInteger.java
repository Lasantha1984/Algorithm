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
public class ReversingAnInteger {
    public static void main(String[] args) {
        System.out.print("Enter Input Here :");
        Scanner input = new Scanner(System.in);
        Integer integer = input.nextInt();
        System.out.println("Reversed Number is :"+getReversed(integer));
    }

    private static int getReversed(Integer integer) {
       StringBuffer sb = new StringBuffer(integer.toString());
       return Integer.parseInt(sb.reverse().toString());
    }
}
