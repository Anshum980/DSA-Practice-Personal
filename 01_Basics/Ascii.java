
import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character :" );
        char ch = in.next().charAt(0);
        System.out.println((int)ch);
    }
}
