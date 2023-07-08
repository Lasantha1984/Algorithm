/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.lamdaexpressions;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author user
 */
public class MaximumSumAndMinimumSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.stream().filter(x->!Objects.equals(x, arr.stream().min(Integer::compareTo))).collect(Collectors.toList());
        System.out.println(arr);
    }
}
