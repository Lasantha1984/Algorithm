/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.arraysandnumbermanupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class OccurrencesOfEachElement {
    public static void main(String[] args) {
//        int[] x = {1,2,4,5,6,7,8,9,10,5,6,7,8,9,5,6,7,5,6,5};
//        int[] distinct = Arrays.stream(x).distinct().toArray();
//        HashMap occurenc = new HashMap();
//        for (int i = 0; i < distinct.length; i++) {
//            int e = distinct[i];
//            int count = 0;
//            for (int j = 0; j < x.length; j++) {
//                int f = x[j];
//                if (f==e) {
//                    count=++count;
//                }
//                
//            }
//            occurenc.put(e, count);
//        }
//        System.out.println("Occurence is : "+occurenc);
        List<String> l = new ArrayList();
        l.add("A");
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        Map<String,Integer> map = new HashMap();
        for (String s : l) {
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
        System.out.println(map);
    }
    
}
