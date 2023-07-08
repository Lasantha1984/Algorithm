/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.arraysandnumbermanupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author user
 */
public class SecondSmallestElement {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
//        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,0};
//        
//        List<Integer> list = Arrays.stream(x).collect(Collectors.toList());
//        List event = (List) list.stream().filter(num->num%2==0).collect(Collectors.toList());
    }
}
