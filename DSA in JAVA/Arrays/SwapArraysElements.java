package Arrays;
import java.util.Arrays;

public class SwapArraysElements {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        swap(a,1,4);
        System.out.println(Arrays.toString(a));
    }
    static void swap(int[] arr,int index,int index2){
        int temp=arr[index];
        arr[index]=arr[index2];
        arr[index2]=temp;
    }
}
