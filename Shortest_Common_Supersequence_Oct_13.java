package geeks_for_geeks;

public class Shortest_Common_Supersequence_Oct_13 {
    public static void main(String[] args) {
        String X = "abcd";
        String Y = "xycd";
        int ans = shortestCommonSuperSequence(X,Y,X.length(),Y.length());
        System.out.println(ans);
    }

    private static int shortestCommonSuperSequence(String X, String Y, int m, int n) {
        int [][]dp=new int[m+1][n+1];

        for(int i=1;i<=m;i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = X.charAt(i - 1) == Y.charAt(j - 1) ?
                        1 + dp[i - 1][j - 1] :
                        Math.max(dp[i - 1][j], dp[i][j - 1]);
                System.out.println(dp[i-1][j-1]);
                System.out.println(dp[i][j]);
                System.out.println(dp[i-1][j]);
                System.out.println(dp[i][j-1]);
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        return n+m-dp[m][n];
    }

}
