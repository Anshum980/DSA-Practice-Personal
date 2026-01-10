
import java.util.Scanner;

public class AlphabetSq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and cols");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char)(j+65)+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char)(i+65)+" ");
            }
            System.out.println();
        }
    }
}
