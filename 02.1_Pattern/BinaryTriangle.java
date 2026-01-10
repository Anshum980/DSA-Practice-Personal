
import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         for (int i = 0; i < n; i++) { // rows no of lines
            for(int j=0;j<=i;j++){
              if(i%2==1){
                if(j%2==1) System.out.print(1 + " ");
                else System.out.print(0 + " ");
              }
              else {
                if(j%2==0) System.out.print(1 + " ");
                else System.out.print(0 + " ");
                }

                // if((i+j)%2==0) System.out.print(1 + " ");
                // else System.out.println(0 + " ");

                // alternate short solution
            }
            System.out.println();
        }
    }
}
