package geeks_for_geeks;

public class Inorder_Traversal_And_BST_Dec_02 {
    public static void main(String[] args) {
        int[] arr ={2,4,5};
        int N = arr.length;
        int ans = isRepresentingBst(arr,N);
        System.out.println(ans);
    }

    private static int isRepresentingBst(int[] arr, int n) {
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1])
                return 0;
        }
        return 1;
    }
}
