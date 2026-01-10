public class SearchInRange {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{69,4,55,5,66,56,545,5}, 56, 3, 7));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
                return -1;
    }
    // searching for a element in an array
    for(int index = start; index < end; index++ ){
        if(arr[index]== target){
            return index;
        }

    }
    return -1;
}
}
