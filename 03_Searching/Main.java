public class Main {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,2,3,4,5}, 4));
        System.out.println(linearSearch2(new int[]{1,2,3,4,5}, 2));
    }
    // returning the index value
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
                return -1;
    }
    // searching for a element in an array
    for(int index = 0; index < arr.length; index++ ){
        if(arr[index]== target){
            return index;
        }

    }
    return -1;
}
// if you want to directly throw the element
static int linearSearch2(int[] arr, int target){
    if(arr.length == 0){
            return -1;
}
// searching for a element in an array
for(int index = 0; index < arr.length; index++ ){
    if(arr[index]== target){
        return arr[index];
    }

}
return -1;
}

}
