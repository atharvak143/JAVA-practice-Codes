package Searching.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int target=8;
        System.out.println(linearSearch(arr, target));
        // To return the target element
        System.out.println(element(arr,target));

    }
    static int linearSearch(int[] arr,int target){
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
               return i;
                
            }
           
        }
        return -1;
        
    }
    static int element(int[] arr,int target){
        for (int i : arr) {
            if(i==target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
