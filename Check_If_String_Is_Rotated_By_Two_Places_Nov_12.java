package geeks_for_geeks;

public class Check_If_String_Is_Rotated_By_Two_Places_Nov_12 {
    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "onamaz";
       boolean rotataed =  isRotated(str1,str2);
        System.out.println(rotataed);
    }

    private static boolean isRotated(String str1, String str2){
        int pos = 2;
        String rotatedLeft = leftRotated(str1,pos);
        String rotatedRight = rightRotated(str1,pos);
        return str2.equals(rotatedRight) || str2.equals(rotatedLeft);
    }

    private static String leftRotated(String str1, int pos) {
        String rotated = str1.substring(pos)+str1.substring(0,pos);
        return rotated;
    }

    private static String rightRotated(String str1, int pos ) {
        return leftRotated(str1, str1.length()-pos);
    }
}
