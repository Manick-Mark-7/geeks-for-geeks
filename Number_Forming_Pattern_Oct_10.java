package geeks_for_geeks;

import java.util.Stack;

public class Number_Forming_Pattern_Oct_10 {
    public static void main(String[] args) {
        String S = "D";
        System.out.println(printMinNumberForPattern(S));
    }
    static String printMinNumberForPattern(String S){
        String ans = "";
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for(int i=0;i<S.length();i++){
            st.push(num);
            num++;
            if(S.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    ans += Integer.toString(st.pop());
                }
            }
        }
        st.push(num);
        while(!st.isEmpty()){
            ans += Integer.toString(st.pop());
        }
        return ans;
    }
}
