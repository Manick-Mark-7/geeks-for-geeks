package geeks_for_geeks;

import java.util.ArrayList;
;
import java.util.Random;

public class Max_Sum_Subarray_Of_Size_K_Dec_11 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        int min = -10;
        int max = 10;
        for(int i=0;i<5;i++) {
            arr.add(rand.nextInt(20));
        }
        System.out.println("The given Array is "+ arr.toString());
        int k = 2;
        int n = arr.size();
        long ans = maximumSumSubarray(k,arr,n);
        System.out.println("The max sum of the subarray of size "+k+" is "+ans);
    }

    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N) {
        long sum = 0;
        long finalSum = 0;
        for (int i = 0; i < K; i++) {
            sum += Arr.get(i);
        }
        finalSum = Math.max(finalSum, sum);

        for (int i = K; i < N; i++) {
            sum -= Arr.get(i - K);
            sum += Arr.get(i);
            finalSum = (long) Math.max(sum, finalSum);
        }

        return finalSum;
    }
}
