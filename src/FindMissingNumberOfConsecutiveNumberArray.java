
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class FindMissingNumberOfConsecutiveNumberArray {
    public static void main(String[] args) {
        int[] x = {1,2,4,5,6,7,8,9,10};
        int lenght = x.length + 1;
        int realTotal = (lenght * (lenght+1))/2;
        int currentSum = Arrays.stream(x).sum();
        System.out.println("Missing Number is "+(realTotal-currentSum));
    }
}
