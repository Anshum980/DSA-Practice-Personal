
import java.util.ArrayList;
import java.util.List;

public class ArrayList2D {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10); arr.add(20);
        List<Integer> brr = new ArrayList<>();
        brr.add(30); brr.add(40);
        List<Integer> crr = new ArrayList<>();
        crr.add(50); crr.add(60);
        List<Integer> drr = new ArrayList<>();
        List<List<Integer>> l = new ArrayList<>();
    l.add(arr); l.add(brr);  l.add(crr); l.add(drr);
        
        for(int i = 0; i < l.size(); i++) {
            for(int j=0; j<l.get(i).size();j++){
             System.out.print(l.get(i).get(j) +" ");
            }
            System.out.println();
        }

        // for(int i = 0; i < l.size(); i++) {
        //     System.out.println(l.get(i));
        // }


    }
}
