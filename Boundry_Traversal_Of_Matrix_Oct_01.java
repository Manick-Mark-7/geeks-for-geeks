package geeks_for_geeks;

import java.util.ArrayList;

public class Boundry_Traversal_Of_Matrix_Oct_01 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = arr.length;
        int m = arr[0].length;
        ArrayList<Integer> ans  = boundryTraversal(arr,n,m);
        System.out.println(ans);
    }

    private static ArrayList<Integer> boundryTraversal(int[][] arr,int n,int m) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<m;i++) list.add(arr[0][i]);
        for(int i=1;i<n;i++) list.add(arr[i][m-1]);
        if(n!=1) for(int i=m-2;i>=0;i--) list.add(arr[n-1][i]);
        if(m!=1) for(int i=n-2;i>=1;i--) list.add(arr[i][0]);
        return list;

        
    }
}
