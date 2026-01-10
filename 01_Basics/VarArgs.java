import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
       fun(547);
       multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
       demo(5,6,6,7,89,99,9,77,7,7);
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
System.out.println(a + b + Arrays.toString(v));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
