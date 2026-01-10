
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter target element :");
        int x = in.nextInt();
        System.out.println("Enter Array Size :");
        int n= in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        //solution
        for (int i = 0; i < n; i++) {
           if(arr[i]==x) {
           System.out.println("Element fount on index number:" + i);
           break;
           }
        }

    
    }
}
