
import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int x = in.nextInt();
        double y = (double)x;
        System.out.println(y/2);
    }
}
