/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.arraysandnumbermanupulation;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class SecondSmallestNumberUsingStreamApi {
    public static void main(String[] args) {
          int[] x = { 5, 6, 7, 8, 9, 10,0};
          int secondSmallest = Arrays.stream(x).sorted().distinct().skip(1).findFirst().orElse(-1);
          System.out.println("Second Smalles :"+secondSmallest);
    }
    
}
