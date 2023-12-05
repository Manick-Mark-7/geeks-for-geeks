package geeks_for_geeks;

import java.util.Arrays;

public class Minimize_The_Heights_II_Dec_05 {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {1,5,8,10};
        int n = arr.length;
        System.out.println(getMinDiff(arr,n,k));
    }

    private static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = arr[n-1]-arr[0];
        int tempmin = arr[0];
        int tempmax = arr[n-1];

        for(int i=1;i<n;i++){
            if(arr[i]-k < 0)continue;

            tempmin = Math.min(arr[0]+k,arr[i]-k);
            tempmax = Math.max(arr[i-1]+k,arr[n-1]-k);
            ans = Math.min(ans,tempmax-tempmin);
        }
        return ans;

    }
}
