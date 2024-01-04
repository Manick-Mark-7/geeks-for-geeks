package geeks_for_geeks;

import java.util.HashMap;
import java.util.Map;



public class Minimum_Number_Of_Operations_To_Make_Array_Empty_Jan_04 {
    public static void main(String[] args) {
        int[] nums =  {2,3,3,2,2,4,2,3,4};
        int ans = minOperations(nums);
        System.out.println("The Number of Operations to make the array as zero is "+ans);
    }

    //Helper function
    private static int minOperations(int[] nums){
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int val = entry.getValue();
            if(val==1) return -1;
            ans+=(val%3);
            if(val%3!=0) ans+=1;
        }
        return ans;
    }
}
