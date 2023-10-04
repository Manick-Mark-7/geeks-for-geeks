package geeks_for_geeks;

public class Roman_To_Integer_Oct_04 {
    public static void main(String[] args) {
        String str = "V";
        int ans = romanToDecimal(str);
        System.out.println(ans);
    }

    private static int romanToDecimal(String str) {
        int ans = 0;
        for(int i=0;i<str.length();i++){
            int s1 = value(str.charAt(i));
            if(i+1<str.length()){
                int s2 = value(str.charAt(i+1));
                if(s1>=s2){
                    ans += s1;
                }else{
                    ans = ans + s2-s1;
                    i++;
                }
            }else{
                ans += s1;
            }

        }
        return ans;
    }
    public static int value(char ch){

        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default :
                return 0;
        }

    }
}
