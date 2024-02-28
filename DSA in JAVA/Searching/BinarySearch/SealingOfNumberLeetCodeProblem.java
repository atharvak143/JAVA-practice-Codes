package Searching.BinarySearch;
import java.util.Arrays;

// smallest element in array greater or = target
public class SealingOfNumberLeetCodeProblem {

    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        sort(arr);
        int target=17;
        int ans=check(arr, target);
        System.out.println(ans);        
    }
    static boolean BinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length -1;
        while(start<=end){
            int mid=start + (end-start)/2;
            int min=0;
            if(arr[mid]>target){
                end=mid-1;

            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]==target){
                return true;
            }
            
        }
        return false;
    }

    static int check(int[] arr,int target){
        if(BinarySearch(arr, target)){
            return target;
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>target){
                    return arr[i];
                    
                }
                
            }
            return -1;
        }
        
    }

    static void sort(int[] arr){
        Arrays.sort(arr);
    }
}