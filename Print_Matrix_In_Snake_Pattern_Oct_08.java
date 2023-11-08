package geeks_for_geeks;

import java.util.ArrayList;

public class Print_Matrix_In_Snake_Pattern_Oct_08 {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        System.out.println(snakePattern(matrix));
    }

    private static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    ans.add(matrix[i][j]);
                }
            } else {
                for (int j = matrix[0].length - 1; j >= 0; j--) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}
