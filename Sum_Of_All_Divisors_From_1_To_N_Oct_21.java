package geeks_for_geeks;

import java.util.Random;

public class Sum_Of_All_Divisors_From_1_To_N_Oct_21 {
    public static void main(String[] args) {
        int n = new Random().nextInt(20);
        System.out.println(sumOfDivisors(n));
    }

    static long sumOfDivisors(int N){
        long sum = 0;
        for(int i=1;i<=N;i++){
            sum+=(i*(N/i));
        }
        return sum;
    }
}
