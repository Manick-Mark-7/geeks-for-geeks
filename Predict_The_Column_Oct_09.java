package geeks_for_geeks;

public class Predict_The_Column_Oct_09 {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{1,0,1},{0,1,1}};
        int N = arr.length;
        System.out.println(columnWithMaxZeros(arr,N));
    }

    private static int columnWithMaxZeros(int[][] arr, int N) {
        int idx = 0;
        int max = 0;

        for(int i=0;i<N;i++){
            int count= 0;
            for(int j=0;j<N;j++){
                if(arr[j][i] == 0)
                    count+=1;
            }
            if(count>max){
                idx = i;
                max = count;
            }
        }
        if(max == 0)
            return -1;
        return idx;
    }


}
