package geeks_for_geeks;

import java.util.Arrays;

public class Sticker_Thief_21_Sep {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {6,5,5,7,4};
        int ans = FindMaxSum(a,n);
        System.out.println(ans);
    }

    private static int FindMaxSum(int[] arr, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return dpSolver(0,arr,dp);
    }
    private static int dpSolver(int ind, int[] arr, int[] dp){
        if(ind>=arr.length)return 0 ;
        if(dp[ind]!=-1)return dp[ind];
        int pick = arr[ind] + dpSolver(ind+2,arr,dp);
        int notpick = dpSolver(ind+1,arr,dp);
        return dp[ind] = Math.max(pick,notpick);
    }
}
