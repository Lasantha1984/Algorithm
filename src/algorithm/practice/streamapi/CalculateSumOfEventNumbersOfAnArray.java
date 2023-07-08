package algorithm.practice.streamapi;

import java.util.Arrays;

public class CalculateSumOfEventNumbersOfAnArray {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        //Converting array in to integer stream Arrays.stream(numbers)
        //Filter only event number usiing .filter(y->y%2==0) on stream
        //Then call the sum function to sumpup the even values filtered by the 
        int sum = Arrays.stream(numbers).filter(y->y%2==0).sum();
        System.out.println("Even sum is :"+sum);
    
    }
}
