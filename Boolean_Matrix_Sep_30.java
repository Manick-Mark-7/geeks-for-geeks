package geeks_for_geeks;

import java.util.Arrays;

public class Boolean_Matrix_Sep_30 {
    public static void main(String[] args) {
        int[][] matrix = {{1,0},{0,0}};
       booleanMatrix(matrix);
    }

    private static void booleanMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] row = new int[r];
        int[] col = new int[c];
        Arrays.fill(row,-1);
        Arrays.fill(col,-1);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == 1){
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i] == 0 || col[j] == 0)
                    matrix[i][j] = 1;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
