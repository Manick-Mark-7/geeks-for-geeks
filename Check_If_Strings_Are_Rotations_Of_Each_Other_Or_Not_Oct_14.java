package geeks_for_geeks;

public class Check_If_Strings_Are_Rotations_Of_Each_Other_Or_Not_Oct_14 {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        System.out.println(areRotations(s1,s2));
    }

    private static boolean areRotations(String s1, String s2) {
        s1 = s1+s1;
        return s1.contains(s2);
    }
}
