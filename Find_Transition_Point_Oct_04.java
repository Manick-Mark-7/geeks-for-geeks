package geeks_for_geeks;

public class Find_Transition_Point_Oct_04 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1};
        int ans = transitionPoint(arr,arr.length);
        System.out.println(ans);
    }

    private static int transitionPoint(int[] arr, int length) {
        for(int i=0;i<length;i++){
            if(arr[i] == 1) return i;
        }
        return -1;
    }
}
