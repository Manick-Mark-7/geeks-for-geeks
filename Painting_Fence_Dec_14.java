package geeks_for_geeks;

public class Painting_Fence_Dec_14 {
    public static void main(String[] args) {
        int n = 2;
        int k = 4;
        long ans = countWays(n,k);
        System.out.println(ans);
    }

    private static long countWays(int n, int k) {
        if(n == 1)
            return k;

        long mod = (long) 1e9 + 7, same = 0, diff = k;

        for(int i = 2; i <= n; i++)
        {
            long prev = same;
            same = diff;
            diff = ((prev + same) * (k - 1)) % mod;
        }

        return (same + diff) % mod;
    }
}
