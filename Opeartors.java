/**
 * Opeartors
 */
public class Opeartors {

    public static void main(String[] args) {
        // int a = +1;
        // a++;
        // System.out.println(a);

        // boolean b = true;
        // System.out.println(b);
        // System.out.println(!b);
        // int bit=0x2222;
        // int c= a+bit;
        // System.out.println(c);

        // int count=5;
        // do{
        //     System.out.println(count);
        // }while(count>5 & count<10);

        // Enhanced for loop 
        // int[] numbers = {1,2,3,4,5,6,7,8,9};

        // for(int i : numbers){
        //     System.out.println(i);
        // }
        //Multi Dimention array

        int arr[][] = {{1,2,3}, {4,5,6},{7,8,9}};

        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}