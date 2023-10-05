package leetcode.binarySearch.daily_challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Element_Two_Oct_05 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> ans = majorityElement(nums);
        System.out.println(ans);

    }

    private static List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        int condition = (int)(Math.floor(len/3));
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(map.get(i)>condition && !list.contains(i))
                list.add(i);
        }
        return list;
    }
}
