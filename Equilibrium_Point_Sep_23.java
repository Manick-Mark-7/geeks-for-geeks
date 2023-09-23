package geeks_for_geeks;

public class Equilibrium_Point_Sep_23 {
    public static void main(String[] args) {
        long[] arr = {1,3,5,2,2};
        int n = arr.length;
        int ans = equilibriumPoint(arr,n);
        System.out.println(ans);
    }

    private static int equilibriumPoint(long[] arr, int n) {
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum+=arr[i];
        }
        int val = 0;
        for(int i=0;i<n;i++){
            if(val == sum-val-arr[i])
                return i+1;
            val+=arr[i];
        }
        return -1;
    }
}
