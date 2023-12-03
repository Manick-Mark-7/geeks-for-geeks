package geeks_for_geeks;

import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;
}
public class Brothers_From_Different_Roots_Dec_03 {
    public static int countPairs(Node root1,Node root2,int x){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        inOrder(list1,root1);
        inOrder(list2,root2);

        int ans = 0;
        int left = 0;
        int right = list2.size()-1;

        while(left<list1.size() && right>=0){
            int sum = list1.get(left) + list2.get(right);
            if(sum == x){
                left++;
                right--;
                ans++;
            }
            else if(sum<x) left++;
            else right--;
        }
        return ans;
    }

    private static void inOrder(ArrayList<Integer> list, Node root) {
        if(root == null) return;
        inOrder(list,root.left);
        list.add(root.data);
        inOrder(list,root.right);
    }
}
