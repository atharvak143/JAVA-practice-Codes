package Searching;
// MaxWealth
public class LeetCodeProblem2 {
    
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(check(arr));
    }
    


static int check(int[][] arr)
{
    
    int max=0;
    for (int person = 0; person < arr.length; person++) {
        int rowSum=0;
        for (int account = 0; account < arr[person].length; account++) {
            rowSum=arr[person][account]+rowSum;
        }
        if(rowSum>max){
            max=rowSum;
        }
    }
    
    
    return max;
}
}

