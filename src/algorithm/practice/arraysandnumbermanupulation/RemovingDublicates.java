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
public class RemovingDublicates {
    
    public static void main(String[] args) {
        int[] x = { 5, 6, 7, 8, 9, 10,0,5,11,8,9};
        int[] distinctArray = Arrays.stream(x).distinct().toArray();
        System.out.println("Before ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
        System.out.println("");
        System.out.println("After ");
        for (int i = 0; i < distinctArray.length; i++) {
            int e = distinctArray[i];
            System.out.print(e+" ");
        }
    }
}
