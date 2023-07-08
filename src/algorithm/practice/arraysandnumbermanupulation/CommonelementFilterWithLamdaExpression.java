/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.arraysandnumbermanupulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class CommonelementFilterWithLamdaExpression {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] y = {4, 6, 8, 10, 12, 14, 16};

        Set<Integer> commonElements = Arrays.stream(x)
                .filter(num -> Arrays.stream(y).anyMatch(yNum -> yNum == num))
                .collect(HashSet::new, Set::add, Set::addAll);
        System.out.println("Common elements: " + commonElements);
    }
}
