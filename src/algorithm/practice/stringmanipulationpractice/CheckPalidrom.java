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
public class CheckPalidrom {
    public static void main(String[] args) {
        System.out.print("Enter the word here : ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println("Is Word A Palidrome : "+word.toLowerCase().equals(new StringBuffer(word.toLowerCase()).reverse().toString()));
        
    }
}
