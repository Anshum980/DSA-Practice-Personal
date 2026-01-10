
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: ");
        int a = in.nextInt();
        System.out.print("B: ");
        int b = in.nextInt();
        System.out.print("C: ");
        int c = in.nextInt();
int max = a;
if(b > max) 
max = b; 
if(c > max){
    max = c;
}
System.out.println("Largest of the three is: "+max);
}
}
