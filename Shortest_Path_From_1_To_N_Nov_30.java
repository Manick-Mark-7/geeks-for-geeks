package geeks_for_geeks;

import java.util.Random;

public class Shortest_Path_From_1_To_N_Nov_30 {
    public static void main(String[] args) {
        int n = new Random().nextInt(10);
        int k = minStep(n);
    }

    private static int minStep(int n) {
        int count = 0;

        while(n!=1){
            if(n%3==0)
                n/=3;
            else
                n-=1;

            count+=1;
        }
        return count;
    }
}
