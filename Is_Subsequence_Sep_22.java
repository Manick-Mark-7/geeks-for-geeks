package leetcode.binarySearch;

public class Is_Subsequence_Sep_22 {
    public static void main(String[] args) {
        String s = new String("abc");
        String t = new String("ahbgdc");
        if(s.length()>t.length()) isSubSequence(t,s);
        boolean ans = isSubSequence(s,t);
        System.out.println(ans);
    }

    private static boolean isSubSequence(String s, String t) {
        int i = 0;
        int j =0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        return i==s.length();
    }
}
