import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        int rno=2;
        int rno1=9;
        Scanner sc =new Scanner(System.in);

        // syntax for array
        // datatype[] var_name= new datatype[size]


        // int[] roll_numbers={23,12,45,32,15};
        //  String[] arr1=new String[4];
        //  System.out.println(arr1[0]);

        //  int[] arr_input=new int[5];
        //  for (int i = 0; i < arr_input.length; i++) {
        //     arr_input[i]=sc.nextInt();
        //  }
        //  for (int i = 0; i < arr_input.length; i++) {
        //     System.out.println(arr_input[i]+" ");
        //  }

        //  for(int num:arr_input){
        //     System.out.println(num);
        //  }

        //  System.err.println(Arrays.toString(arr_input));




            int[] nums = {3,4,5,12};
            System.out.println(Arrays.toString(nums));
            change(nums);
            System.out.println(Arrays.toString(nums));


    }

    static void change(int[] arr){
        arr[0]=99;
    }
    

}