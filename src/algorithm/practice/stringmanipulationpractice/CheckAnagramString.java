/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.stringmanipulationpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CheckAnagramString {
    public static void main(String[] args) {
        System.out.print("Enter words here with comma seperator : ");
        Scanner input = new Scanner(System.in);
        String words[] = input.next().split(",");
        System.out.println("Words are anagram : "+isAnagram(words[0],words[1]));
         
    }

    private static boolean isAnagram(String word1, String word2) {
        if (word1.length()!=word2.length()) {
            return false;
        }
       List<String> a1 = Arrays.asList(word1.split(""));
       List<String> a2 = Arrays.asList(word2.split(""));
       Collections.sort(a1);
       Collections.sort(a2);
       return a1.containsAll(a2);
    }
   
}
