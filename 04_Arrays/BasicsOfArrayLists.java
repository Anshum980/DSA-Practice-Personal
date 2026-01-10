
import java.util.ArrayList;

public class BasicsOfArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,33);
        arr.add(2,332); // initialize
        arr.add(3,32);
        arr.add(4,69);
        arr.add(5,50);
        // for (int i=0;i<6;i++) {
        //     System.out.println(arr.get(i) + " "+ i);  // print k liye .get
        // }
        System.out.println(arr);
        arr.set(2,6969 ); //modify
        arr.add(89);
        arr.add(90); // last mein add hio jata h
        System.out.println("Size of the Array "+arr.size());
        for (int i = 0; i < arr.size(); i++) {
               System.out.print(arr.get(i) +" ");
            
        }
        System.out.println("\n");
        System.out.println(arr);
    }
}



