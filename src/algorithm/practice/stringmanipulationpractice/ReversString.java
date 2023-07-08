/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.stringmanipulationpractice;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ReversString {
    public static void main(String[] args) {
        System.out.print("Enter Input Here :");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        String reversedString = new StringBuffer(inputString).reverse().toString();
        System.out.println("Input Is : "+inputString);
        System.out.println("Reversed String Is :"+reversedString);
    }
}
