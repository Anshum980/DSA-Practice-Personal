
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
       
        while(count <= n) {                        
       int temp = b;                                // b ki value temp mein store krri phir usko a k saath add kiya then a mein temp store kr diya
       b = a + b;
       a = temp;
       count++;
    }
    System.out.println(b);
    
    }
}
