package geeks_for_geeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Top_K_Frequent_Element_In_Array_Oct_05 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topK(nums,k)));
    }
    public static int[] topK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> (map.get(a)==map.get(b))? b-a:map.get(b)-map.get(a));
        int count = 0;
        for(int key : map.keySet()){
            pq.add(key);
        }
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.peek();
            pq.remove();
        }
        return ans;

    }
}
