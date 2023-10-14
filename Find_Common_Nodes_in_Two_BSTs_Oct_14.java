package geeks_for_geeks;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Find_Common_Nodes_in_Two_BSTs_Oct_14 {
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    void inorder(Node root, Map<Integer,Integer> map){
        if(root==null)return;
        inorder(root.left,map);
        map.put(root.data,1);
        inorder(root.right,map);
    }
    void helper(Node root, Map<Integer,Integer> map, ArrayList<Integer> ans){
        if(root==null)return;
        helper(root.left,map,ans);
        if(map.containsKey(root.data)){
            ans.add(root.data);
        }
        helper(root.right,map,ans);
    }
    ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        Map<Integer,Integer> map = new TreeMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root1,map);
        helper(root2,map,arr);
        return arr;
    }
}
