package geeks_for_geeks;

import java.util.HashMap;

public class Number_Of_Distinct_Subsequences_Oct_02 {
    public static void main(String[] args) {
        String s = "gfg";
        int ans = distinctSubSequences(s);
        System.out.println(ans);
    }

    private static int distinctSubSequences(String S) {
        int mod = (int) Math.pow(10,9)+7;
        int len = S.length();
        int[] dp = new int[len+1];
        dp[0] =1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=1;i<=len;i++){
            char c = S.charAt(i-1);
            dp[i] = 2*(dp[i-1])%mod;
            if(map.containsKey(c)){
                int idx = map.get(c);
                dp[i] = (dp[i]-dp[idx-1]+mod)%mod;
            }
            map.put(c,i);
        }
        return dp[len];
    }
}
