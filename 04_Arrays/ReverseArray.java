public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        for (int ele : arr) {
            System.out.print(ele+ "  ");
        }
        // reversing array by creating another one
        // int[] rev = new int[arr.length];
        // int n = arr.length;
        // for (int i = 0; i < n; i++) {
        //     rev[i] = arr[n - 1 - i];  // Correcting the logic
        // }

        // // Printing reversed array
        // System.out.print("\nReversed Array: ");
        // for (int ele : rev) {
        //     System.out.print(ele + "  ");
        // }

        // without creating new array
        // using two variable
        // i+j = n-1 formula
        int n=arr.length;
        for(int i=0; i<n;i++){
            int j = n-i-1;
            if(i>j){     // iske jagah pe hum loop ko n/2 tak bhi chala sakte h
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
           
        }
        System.out.println( "\n" +"After Reversing");
        for (int ele : arr) {
            
            System.out.print(ele+ "  ");
        }


        // now by using two pointer 
        //int n = arr.length;
        int i=0;
        int j=n-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        System.out.println();
        System.out.println("Again reversing");
        for(int ele: arr){
            System.out.print(ele+" ");
        }


    }
}
