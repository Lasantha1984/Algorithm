/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.arraysandnumbermanupulation;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class OddAndEvenNumberPrinting {
    
    public static void main(String[] args) {
        String word = "Foxjumpinthejungletoeatmeatzzzz";
        HashMap<String,Integer> map = new HashMap();
        String ar[] = word.split("");
        for (String ar1 : ar) {
            if (map.containsKey(ar1)) {
               map.put(ar1, map.get(ar1)+1);
            }else {
              map.put(ar1, 1);
            }
        }
        System.out.println(map);
    }
    
}
