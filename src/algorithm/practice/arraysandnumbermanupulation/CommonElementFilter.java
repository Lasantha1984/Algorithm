/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.arraysandnumbermanupulation;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CommonElementFilter {
    
    public static void main(String[] args) {
        int x[] = {1,2,3,4,5,6,7,8,9,10};
        int y[] = {4,6,8,10,12,14,16};
        ArrayList<Integer> common = new ArrayList();
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < x.length; j++) {
                 if (y[i]==x[j]) {
                    common.add(x[j]);
                    break;
                }
                
            }
            
        }
        System.out.println("Common elements "+common.toString());
    }
}
