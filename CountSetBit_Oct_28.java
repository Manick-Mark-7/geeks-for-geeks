package geeks_for_geeks;

import java.util.Random;

public class CountSetBit_Oct_28 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10);
        System.out.println("The given number is :" + n);
        System.out.println("The Number of the set bits in the given number is" + CountSetBit(n));
    }

    private static int CountSetBit(int n) {
        int count = 0;
        while(n>0){
            count+=n&1;
            n>>=1;
        }
        return count;
    }
    }

