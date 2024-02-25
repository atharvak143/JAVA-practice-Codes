package Arrays;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        revers(arr,0,5);
        System.out.println(Arrays.toString(arr));
        
    }
    static void revers(int[] arr,int start,int end){
        
        for(int i=start;i<=end;i++){
            int temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            start++;
            end--;


        } 
    }
}
