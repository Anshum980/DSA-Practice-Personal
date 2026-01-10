public class floydtriangle {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i < 6; i++) { // rows no of lines
            for(int j=0;j<=i;j++){
                System.out.print(a++ + " "); 
              //  a+=1;
            }
            System.out.println();
        }
    }
}
