package geeks_for_geeks;

import java.util.ArrayList;

public class Find_the_closest_pair_from_two_arrays_Sep_27 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7};
        int[] brr ={10,20,30,40};
        int n = arr.length;
        int m = brr.length;
        int X=32;
        ArrayList<Integer> ans = printClosest(arr,brr,n,m,X);
        System.out.println(ans);
    }

    private static ArrayList<Integer> printClosest(int[] arr, int[] brr, int n, int m, int x) {
        int i = 0;
        int j = brr.length-1;
        int first = 0,sec = 0;
        int sum = 0;
        int curr_diff = 0;
        int p = Integer.MAX_VALUE;
        while(i<arr.length && j>=0){

            sum = arr[i]+brr[j];
            curr_diff = Math.abs(x-sum);

            if(curr_diff<p){
                first = arr[i];
                sec = brr[j];
                p = curr_diff;
            }
            if(sum<x){
                i++;
            }else{
                j--;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(first);
        ans.add(sec);
        return ans;
    }
}
