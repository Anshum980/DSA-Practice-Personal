public class CountVowels {
    public static void main(String[] args) {
        String str = "Anshum Sharma is an Uncle";
        int n = str.length();
          int count = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='i'){
                count++;
            }
        }
        System.out.println(count);
    }
}





// Interpreted language - line by line execution
// Compile time - compile and execution, translate


