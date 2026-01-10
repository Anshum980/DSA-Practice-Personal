

public class BasicDeclarationof2Darrays {
    public static void main(String[] args) {
        int[][] grid = new int[5][3];
        int n = grid.length; // no of rows
        int m = grid[0].length; // no of cols
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(grid[i][j] +" ");
        }
        System.out.println();
       }
    }
}
