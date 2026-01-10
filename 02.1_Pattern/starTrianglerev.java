
import java.util.Scanner;

public class starTrianglerev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = in.nextInt();
         for (int i = 1; i <=n; i++) { // rows no of lines
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*" + " "); 
            }
            System.out.println();
        }
    }
}

// i + jmax = n + 1 
