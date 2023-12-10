package geeks_for_geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Find if an array contains a subarray which's sum is zero
public class SubArray_With_Sum_Zero_Dec_10 {
    public static void main(String[] args) {
        //creating array of size 5
        int[] arr = new int[5];
        //adding elements using Random() method in the range of -10 to 20
        int min = -10;
        int max = 10;
        for(int i=0;i<5;i++){
            arr[i] = (int)(min+(max-min)*Math.random());
        }
        System.out.println("The given array is: "+ Arrays.toString(arr));
        boolean ans = findSum(arr,arr.length);
        System.out.println("The given array : "+Arrays.toString(arr)+" is"+((ans==true)?" contains": " not contains")+" sub array which sum is zero");
    }

    private static boolean findSum(int[] arr, int length) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        list.add(sum);
        for(int i: arr){
            sum+=i;
            if(list.contains(sum)) return true;
            else list.add(sum);
        }
        return false;
    }
}
