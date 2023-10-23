package geeks_for_geeks;

public class Maximum_Sum_Increasing_Subsequence_Oct_23 {
    public int maxSumIS(int arr[], int n)
    {
        int[] dp = new int[n];
        dp[0] = arr[0];
        int ans = arr[0];
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i])
                    dp[i] = Math.max(dp[i],dp[j]);
            }
            dp[i]+=arr[i];
            ans = Math.max(dp[i],ans);
        }
        return ans;
    }
}
