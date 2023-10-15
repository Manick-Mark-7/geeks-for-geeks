package geeks_for_geeks;

import java.util.ArrayList;

public class Balanced_BST_Oct_15 {
    class Node{
        int data;
        Node right,left;
        Node(int item){
            data = item;
            left = right = null;
        }
    }
    Node buildBalancedTree(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
        Node ans = balancedTree(list,0,list.size()-1);
        return ans;
    }

    private void inOrder(Node root,ArrayList<Integer> list){
        if(root == null)
            return;
        inOrder(root.left,list);
        list.add(root.data);
        inOrder(root.right,list);
    }

    Node balancedTree(ArrayList<Integer> list,int l,int r){
        if(l>r)
            return null;

        int mid = (l+r)/2;
        Node root = new Node(list.get(mid));
        root.left = balancedTree(list,l,mid-1);
        root.right = balancedTree(list,mid+1,r);

        return root;
    }
}
