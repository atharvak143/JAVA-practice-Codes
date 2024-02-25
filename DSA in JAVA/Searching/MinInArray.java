package Searching;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr={4,3,2,-1,0,5,7,8,9,-34,-45};
        int start=1;
        int end =5;
        System.out.println(min(arr,start,end));
        // if any specific range
    }
    static int min(int[] arr,int start,int end){
        int minVal=arr[0];
        for (int i = start+1; i < end; i++) {
            if(arr[i]<minVal){
                minVal=arr[i];
            }
        }
        return minVal;
    }
}
