import java.util.Scanner;

public class startrianglef2ndmethodlipped {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = in.nextInt();
         for (int i = 1; i <=n; i++) { // rows no of lines
            for(int j=1;j<=n-i;j++){
                System.out.print(" " + " "); 
            }
             for(int j=1;j<=i;j++){
                System.out.print((char)(j+64) + " "); 
            }
            System.out.println();
        }
    }
}
