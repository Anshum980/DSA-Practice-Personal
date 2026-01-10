public class SortZeroesOnes {
    public static void main(String[] args) {
        int[] arr ={1,0,1,0,0,1,0,1,0,1,0,1};
        int n = arr.length;
    //    int noOfZeroes =0, noOfOnes = 0;
        // for(int i=0;i<n;i++){
        //    if(arr[i]==0) noOfZeroes++;
        //    else noOfOnes++; 
        // }
        // for(int i=0;i<noOfZeroes;i++){
        //     arr[i] = 0;
        // }
        // for(int i=noOfZeroes;i<n;i++){
        //     arr[i]=1;
        // }

        // for(int i=0;i<n;i++){
        //     if(i<noOfZeroes) arr[i]=0;
        //     else arr[i] = 1;
        // }
        //  for (int i : arr) {
        //     System.out.print(i + " ");
        //  }
        


         // best solution 
        // one pass solution means? (ek hi traversal mein solution leke aa  jao)
            int i=0, j=n-1;
            while (i<j) {   // ek baar i<=j krke dekhna and arr sorted rakh k dekhna edge case pata chalegi
                if(arr[i] == 0) i++;
                if(arr[j] == 1) j--;
                if(i>j) break;
                if(arr[i] == 1 && arr[j] == 0 ){
                   arr[i] = 0;
                   arr[j] = 1;
                   i++;
                   j--;
                }
            }
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
 

    }
}
