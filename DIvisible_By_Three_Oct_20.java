package geeks_for_geeks;

public class DIvisible_By_Three_Oct_20 {
    public static void main(String[] args) {
        int[] arr = {40,50,90};
        int N  = arr.length;
        System.out.println(isPossible(N,arr));
    }

    static int isPossible(int N, int arr[]) {
        long sum =0;
        for(int i:arr){
            sum+=(long)i;
        }
        return sum%3==0?1:0;
    }
}
