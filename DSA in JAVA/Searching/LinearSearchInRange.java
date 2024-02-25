package Searching;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int target=3;
        int start=1;
        int end=4;
        System.out.println(linearSearch(arr, target,start,end));
      
        

    }
    static int linearSearch(int[] arr,int target,int start,int end){
        
        for (int i = start; i <= end; i++) {
            if(arr[i]==target){
               return i;
                
            }
           
        }
        return -1;
        
    }
}
