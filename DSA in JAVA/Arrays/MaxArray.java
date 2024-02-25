package Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,45,6,7};
        max(arr,1,4);
        System.out.println(max(arr,0,2));
    }
    static int max(int[] a,int start ,int end){
        int maxVal=a[0];
        for (int i = start; i <= end; i++) {
            if(a[i]>maxVal){
                maxVal=a[i];
            }
            
        }
        return maxVal;
    }
}
