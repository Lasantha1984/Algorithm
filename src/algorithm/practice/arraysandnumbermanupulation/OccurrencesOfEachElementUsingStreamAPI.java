/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.arraysandnumbermanupulation;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author user
 */
public class OccurrencesOfEachElementUsingStreamAPI {
    public static void main(String[] args) {
        int[] x = {1,2,4,5,6,7,8,9,10,5,6,7,8,9,5,6,7,5,6,5};
        Map<Integer, Long> occurrenceMap = Arrays.stream(x)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println("Occurrences: " + occurrenceMap);
    }
    
}
