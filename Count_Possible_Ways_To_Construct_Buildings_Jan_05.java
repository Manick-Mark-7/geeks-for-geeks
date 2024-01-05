package geeks_for_geeks;

import java.util.Random;

public class Count_Possible_Ways_To_Construct_Buildings_Jan_05 {
    public static void main(String[] args) {
        int N = new Random().nextInt(10);
        System.out.println("Number is "+N);
        int ans = totalWays(N);
        System.out.println(ans);
    }

    private static int totalWays(int n) {
        long mod = 1000000007;
        if(n==1) return 4;
        if(n==2) return 9;
        long prev = 2, curr=3,ans=0;
        for(int i=3;i<=n;i++){
            ans = (prev+curr)%mod;
            prev= curr;
            curr = ans;
        }
        return (int)(ans*ans % mod);
    }
}
