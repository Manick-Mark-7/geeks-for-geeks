package geeks_for_geeks;

public class Sum_Of_All_XOR_Pairs_Oct_30 {
    public static void main(String[] args) {
        int[] arr = {7,3,5};
        int len = arr.length;
        long ans = sumXOR(arr,len);
    }

    private static long sumXOR(int[] arr, int n) {
        long result = 0;
        for (int i = 0; i < 32; i++) {
            long countOnes = 0;

            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) != 0) {
                    countOnes++;
                }
            }

            result += (countOnes * (n - countOnes)) * (1L << i);
        }

        return result;
    }
}
