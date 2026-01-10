public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {-1,3,8,5,4,2,9};
        int x = 9;
        for(int i=0; i<arr.length;i++ ){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println("Elements are : "+arr[i] +" "+ arr[j]);
                    System.out.println("Index Numbers :"+ i + " " + j);
                    break;
                }
            }
        }
    }
}
