package geeks_for_geeks;

import java.util.ArrayList;

public class Transitive_Closure_Of_A_Graph_Oct_17 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 0, 1},
                {0, 1, 1, 0},
                {0, 0, 1, 1},
                {0, 0, 0, 1}};
        int N = 4;
        System.out.println(transitiveClosure(N, matrix));
    }

    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][]) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {

                for (int k = 0; k < graph.length; k++) {
                    if (k == j)
                        graph[j][k] = 1;
                    if (graph[j][k] == 0) {
                        if (graph[j][i] == 1 && graph[i][k] == 1)
                            graph[j][k] = 1;
                    }
                }

            }

        }
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                arr.add(graph[i][j]);
            }
            a.add(arr);
        }
        return a;
    }
}
