package Searching.BinarySearch;

import java.util.Arrays;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={99,88,77,66,55};
        // Arrays.sort(arr);
        int target=66;
        if(arr[0]>target){
            int ans=BinarySearchDecending(arr, target);
            System.out.println(ans);
        }
        else{
            int ans=BinarySearchAscending(arr, target);
            System.out.println(ans);
        }
        
        
    }

    static int BinarySearchAscending(int [] arr,int target){

        int start=0;
        int end = arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            
            else{
                return mid;
            }
        }
        return -1;

    }

    static int BinarySearchDecending(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<= end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                start=mid+1;
            }
            else if(arr[mid]<target){
                end=mid-1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
    static void Order(int [] arr,int target){
        if(arr[0]>arr[arr.length-1]){
            BinarySearchDecending(arr, target);
            
        }
        else{
            BinarySearchAscending(arr, target);
            
        }
    }
}
