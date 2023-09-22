package geeks_for_geeks;

import java.util.ArrayList;

public class First_Last_Occur_Sep_22 {
    public static void main(String[] args) {
        int[] arr =  { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int n = arr.length;
        int x = 5;
        ArrayList<Integer> ans = find(arr,n,x);
        System.out.println(ans);
    }

    private static ArrayList<Integer> find(int[] arr, int n, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-1);
        int left = 0;
        int right = n-1;
        while(left<=right){
            if(arr[left] == x && arr[right] == x){
                list.add(0,left);
                list.add(1,right);
            }
            if(arr[left]<x) left++;
            if(arr[right]>x) right--;
        }
        return list;
    }
}
