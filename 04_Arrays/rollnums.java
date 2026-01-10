public class rollnums {
    public static void main(String[] args) {
        int[] arr = {81,45,65,12,34,56,69,24};
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<35){
                System.out.println(i);
            }
            
        }
    }
}