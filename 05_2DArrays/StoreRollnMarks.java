
import java.util.Scanner;



public class StoreRollnMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[4][2];
        for(int i=0;i<4;i++){
            for (int j = 0; j < 2; j++) {
               arr[i][j] = in.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<4;i++){
            for (int j = 0; j < 2; j++) {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
