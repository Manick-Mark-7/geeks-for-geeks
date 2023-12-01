package leetcode.binarySearch.daily_challenge;

class Node{
    int data;
    Node left;
    Node right;
}

public class Check_Whether_BST_Contains_Dead_End_Dec_01 {
    public static boolean isDeadEnd(Node root)
    {
        return helper(root,1,Integer.MAX_VALUE);
    }

    private static boolean helper(Node root, int min ,int max){
        if(root == null) return false;
        if(min == max) return true;
        boolean left = helper(root.left,min,root.data-1);
        boolean right = helper(root.right,root.data+1,max);

        return left || right;
    }
}
