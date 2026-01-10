public class oddNumTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) { // rows no of lines
            for(int j=1;j<=i;j++){
                System.out.print(2*j-1 + " "); 
            }
            System.out.println();
        }
    }
}
