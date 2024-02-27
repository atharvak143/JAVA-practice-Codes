package Searching.LinearSearch;

import java.util.Arrays;

// Statement:Given an array of elements ,return how many of them contains an even numbers of digits
public class LeetCodeProblem1 {
    public static void main(String[] args) {
        int[] arr={18,124,9,1764,98,1};
        int a=check(arr);
        System.out.println(a);
        System.out.println(check(500001));
       
        
        
    }

    static int check(int[] arr){
        int count=0;
        int digits=0;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            if(arr[i]<10){
                count=1;
            }
            else{
                while (arr[i]>0) {
                    int rem=arr[i]%10;
                int divi=arr[i]/10;
                arr[i]=divi;
                count++;    
                }
                
                
            }
            if(count%2==0){
                digits++;
            }
        }
        return digits;
        
    }

    // Method2
    static int check(int num){
        return (int) Math.log10(num)+1;
    }
    
}
