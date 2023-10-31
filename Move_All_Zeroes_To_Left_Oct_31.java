package geeks_for_geeks;

public class Move_All_Zeroes_To_Left_Oct_31 {
    public static void main(String[] args) {
        int[] arr = {2,4,0,5,0,7};
        int n = arr.length;
        pushZerosToEnd(arr,n);
        System.out.println(arr);
    }

    private static void pushZerosToEnd(int[] arr, int n) {
        int ptr = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
                arr[ptr++] = arr[i];
        }
        while(ptr<n){
            arr[ptr++] = 0;
        }

    }
}
