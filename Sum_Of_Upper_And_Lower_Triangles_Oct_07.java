package geeks_for_geeks;

import java.util.ArrayList;

public class Sum_Of_Upper_And_Lower_Triangles_Oct_07 {
    public static void main(String[] args) {
        int N = 3 ;
       int mat[][] = {{6, 5, 4},
            {1, 2, 5},
            {7, 9, 7}};
        System.out.println(sumTriangles(mat,N));
    }

    private static ArrayList<Integer> sumTriangles(int[][] matrix, int n) {
        int sum1=0,sum2=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum1 +=matrix[i][j];
            }
        }
        for(int k=0;k<n;k++){
            for(int l=0;l<=k;l++){
                sum2 +=matrix[k][l];
            }
        }
        list.add(sum1);
        list.add(sum2);
        return list;
    }
}
