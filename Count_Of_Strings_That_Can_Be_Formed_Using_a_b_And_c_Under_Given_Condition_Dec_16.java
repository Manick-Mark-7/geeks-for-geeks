package geeks_for_geeks;

import java.util.Random;

public class Count_Of_Strings_That_Can_Be_Formed_Using_a_b_And_c_Under_Given_Condition_Dec_16 {
    public static void main(String[] args) {
        int n = new Random().nextInt(10);
        long ans = countStr(n);
        System.out.println("Given number is: "+n);
        System.out.println(ans);
    }

    static long countStr(long n)
    {

        return (1+(2*n)+(n*((n*n)-1)/2));
    }
}
