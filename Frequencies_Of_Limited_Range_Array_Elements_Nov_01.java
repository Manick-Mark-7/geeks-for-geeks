package geeks_for_geeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequencies_Of_Limited_Range_Array_Elements_Nov_01 {
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,5};
        int N = arr.length;
        int P = 5;
        frequencyCount(arr,N,P);
        System.out.println(Arrays.toString(arr));
    }

    private static void frequencyCount(int[] arr, int n, int p) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=n;i++){
            map.put(i,0);
        }
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            arr[i] = map.get(i+1);
        }
    }
}
