package leetcode.binarySearch.daily_challenge;

public class Monotonic_Array_Sep_30 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        System.out.println(isMonotonic(nums));
    }

    private static boolean isMonotonic(int[] nums) {
        if(nums.length<2) return true;
        int pos = 0;
        for(int i = 1;i< nums.length;i++){
            if(nums[i] > nums[i-1]){
                if(pos == 0) pos = 1;
                else if(pos == -1) return false;
            }
            else if(nums[i] < nums[i-1]){
                if(pos == 0) pos = -1;
                else if(pos == 1) return true;
            }
        }
        return true;
    }
}
