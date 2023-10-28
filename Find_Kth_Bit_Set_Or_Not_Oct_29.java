package geeks_for_geeks;

import java.util.Random;

public class Find_Kth_Bit_Set_Or_Not_Oct_29 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10);
        int k = rand.nextInt(n);
        System.out.println("The number is :"+n);
        System.out.println("The position of the bit is:"+k);
        System.out.println(checkKthBit(n,k));
    }

    private static boolean checkKthBit(int n, int k){
        return ((n>>k)&1)==1?true:false;
    }
}
