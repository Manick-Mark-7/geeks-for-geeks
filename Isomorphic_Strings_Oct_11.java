package geeks_for_geeks;

import java.util.Arrays;

public class Isomorphic_Strings_Oct_11 {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxy";
        System.out.println(areIsomorphic(str1,str2));
    }

    private static boolean areIsomorphic(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }

        int[] s1 = new int[256];
        int[] s2 = new int[256];
        Arrays.fill(s1,-1);
        Arrays.fill(s2,-1);

        for(int i=0;i<str1.length();i++){
            char ss = str1.charAt(i);
            char tt = str2.charAt(i);

            if(s1[ss] == -1 && s2[tt] == -1){
                s1[ss] = tt;
                s2[tt] = ss;
            }
            else if(s1[ss]!=tt || s2[tt]!=ss)
                return false;

        }
        return true;


    }
}
