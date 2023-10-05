package geeks_for_geeks;

public class Count_Number_Of_SubString_Oct_05 {
    public static void main(String[] args) {
        String S = "aba";
        int K = 2;
        long ans = substrCount(S,K);
        System.out.println(ans);
    }

    private static long substrCount(String S, int K) {
        return atmost(S,K)-atmost(S,K-1);
    }

    private static long atmost(String s, int k) {
        int arr[] = new int[26];

        int dist = 0, left = 0;
        long res = 0;

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            if(arr[s.charAt(i) - 'a'] == 1) dist++;

            while(dist > k){
                arr[s.charAt(left)-'a']--;
                if(arr[s.charAt(left)-'a'] == 0) dist--;
                left++;
            }
            res = res + (i-left+1);
        }
        return res;
    }
}
