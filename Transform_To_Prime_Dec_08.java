package geeks_for_geeks;

import java.util.Arrays;
import java.util.Random;

//Here we are going to try to make the sum of given array of numbers as a minimum Prime number which is next to the given number
public class Transform_To_Prime_Dec_08 {
    public static void main(String[] args) {
        int[] arr = new int[4];

        for(int i=0;i<4;i++) {
            int n = new Random().nextInt(50);
            arr[i] = n;
        }
        int ans = minNumber(arr);
        int sum = Arrays.stream(arr).sum();
        System.out.println("The prime number near to "+sum+" is: "+ans);
    }

    private static int minNumber(int[] arr) {
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        if(isPrime(sum)) return sum;
        int prev = sum;
        while(!isPrime(sum)) sum+=1;
        return sum-prev;
    }

    private static boolean isPrime(int n) {
        if(n<=2) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
