 package Searching.BinarySearch;

import java.util.Arrays;

class BinarSearchAlgo {
    public static void main(String[] args) {
        int[] arr={4,3,5,6,8,9,7,1};
        int target=4;
        sort(arr);
        int ans=BinarySearch(arr, target);
        System.out.println(ans);
        
    }

    static int BinarySearch(int[] arr ,int target){
        int start =0;
        int end=arr.length -1;
        
        while(start<=end){
            int  mid=start + (end - start)/2;
            if(arr[mid]>target){
                end=mid-1;

            }
            else if (arr[mid]<target) {
                start=mid+1;
            }
            else
            {
                return target;
            }
        }
        return -1;

    }
    static void sort(int[] arr){

        Arrays.sort(arr);

    }
    
}