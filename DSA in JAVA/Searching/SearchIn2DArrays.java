package Searching;

public class SearchIn2DArrays {
    
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4}
            ,{5,6,7}
            ,{8,9,0}
        };
        int target=0;
        System.out.println(search(arr,target));    
    }
    static int search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column]==target){
                    //return new int[] {row,column};
                    return arr[row][column];
                }
            }
        }
        return -1;
    }

}
