package geeks_for_geeks;

public class Array_Pair_Sum_Divisibility_Jan_01 {
    public boolean canPair(int[] nums, int k) {
        int n = nums.length;
        if(n%2!=0) return false;

        int[] ans = new int[k];
        for(int i:nums) ans[i%k]++;

        if(ans[0]%2 == 1) return false;
        for(int i=1;i<ans.length/2;i++){
            if(ans[i]!=ans[k-i]) return false;
        }

        return true;
    }
}
