public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        int[] swaparray = swap(a, b);

        a = swaparray[0];
        b = swaparray[1];

        System.out.println(a+ " " + b);

        String name = "Kunal Kushwaha";
        name = changeName(name);
        System.out.println(name);
    }

    static String changeName(String name) {
        name = "Rahul Rana"; // creating a new object
      return name;

    }

    static int[] swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        int swaparray[] = {num1, num2}; 
        return swaparray;

        // this change will only be valid in this function scope only.
    }
}
