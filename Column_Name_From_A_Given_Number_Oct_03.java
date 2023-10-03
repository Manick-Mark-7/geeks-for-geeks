package geeks_for_geeks;

import java.util.Random;
import java.util.Scanner;

public class Column_Name_From_A_Given_Number_Oct_03 {
    public static void main(String[] args) {
        long num;
        String ans;
        try{
            num = new Random().nextLong(30);
            ans = colName(num);
            System.out.println(num +" "+ans);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("EOF");
        }
    }

    private static String colName(long num) {
        long n = num;
        String temp = "";
        while(n>0){
            char c = (char)('A'+(n-1)%26);
            temp = c+temp;
            n = (n-1)/26;
        }
        return temp;
    }
}
