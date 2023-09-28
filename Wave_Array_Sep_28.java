package geeks_for_geeks;

import java.util.Arrays;

public class Wave_Array_Sep_28 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        convertToWave(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void convertToWave(int[] arr, int n) {
        for(int i=1;i<n;i+=2)
            swap(i,i-1,arr);
    }

    static void swap(int a,int b,int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
