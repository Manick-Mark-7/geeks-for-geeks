package geeks_for_geeks;

public class New_Year_Resolution_Dec_31 {

    public static void main(String[] args) {
        int[] coins = {5,8,9,10,14,2,3,5};
        int N = coins.length;
        boolean ans = isPossible(N,coins);
        System.out.println(ans);
    }
    public static boolean isPossible(int N, int[] coins) {
        return helper(0,coins,N,0);

    }

    private static boolean helper(int idx,int coins[],int n,int sum){
        if(sum !=0 && (sum%2024==0 || sum%20==0 || sum%24 == 0)){
            return true;
        }

        if(idx == n) return false;

        boolean val1 = helper(idx+1,coins,n,sum+coins[idx]);
        if(val1 == true) return true;
        boolean val2 = helper(idx+1,coins,n,sum);
        if(val2 == true) return true;

        return false;
    }
}
