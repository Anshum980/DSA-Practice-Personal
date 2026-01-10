import java.util.Scanner;

public class starBridge {
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=2*n-1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
       for (int i = 1; i <=n; i++) { // rows no of lines
        int a =1;   
        for(int j=1;j<=n+1-i;j++){
                System.out.print(a+++ " "); 
            }  
        
        for(int j=1;j<=2*i-1;j++){
                System.out.print(" " + " "); 
                a++;
            }
            for(int j = 1;j<=n+1-i;j++){
                System.out.print(a+++" ");
            }
            System.out.println();
        }
    }
}
