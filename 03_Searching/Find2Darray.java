

import java.util.Arrays;



 public class Find2Darray{
    public static void main(String[] args) {
        int[][] arr = {
            {12,6,19,5},
            {3,6,7,8,0},
            {69,59},
            {56,78,90}
        };
        int target = 69;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        
        for(int row = 0; row<arr.length; row++){
            for(int col=0;col<arr[row].length; col++){
               if(arr[row][col] == target){
                return new int[]{row,col};
               }
            }
        }
        return new int[]{-1,-1};
    }
 }