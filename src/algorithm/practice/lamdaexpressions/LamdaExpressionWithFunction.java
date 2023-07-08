/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.lamdaexpressions;

import java.util.function.Function;

/**
 *
 * @author user
 */
public class LamdaExpressionWithFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleFunction = (num) -> num * 2;
        System.out.println("Value is :"+doubleFunction.apply(2));
    }
}
