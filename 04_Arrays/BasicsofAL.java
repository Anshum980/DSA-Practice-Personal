
import java.util.Arrays;

public class BasicsofAL {
    public static void main(String[] args) {
        int[] arr = {30,10,40,98,78,69};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
