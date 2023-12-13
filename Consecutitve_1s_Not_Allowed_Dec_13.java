package geeks_for_geeks;

public class Consecutitve_1s_Not_Allowed_Dec_13 {
    public static void main(String[] args) {
        int n=3;
        long ans = countStrings(n);
        System.out.println(ans);
    }
    static long countStrings(int n) {
        int mod = (int)(1e9+7);
        int[] dp = {1,1};
        for(int i =2;i<=n;i++){
            dp[0] = (dp[0]+dp[1])%mod;
            dp[1] = (dp[0]-dp[1])%mod;
        }
        return ((dp[0]+dp[1])%mod+mod)%mod;
    }
}
