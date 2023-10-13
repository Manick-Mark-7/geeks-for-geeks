package geeks_for_geeks;

public class Floor_In_BST_13_Oct {
    class Node{
        int data;
        Node right;
        Node left;
        Node(int val){
            data = val;
            right = null;
            left = null;
        }
    }

    public static int floor(Node root,int x){
        int floor =-1;
        while(root!=null){
            if(root.data>x)
                root = root.left;
            else if(root.data<x){
                floor = root.data;
                root = root.right;
            }
            else{
                return root.data;
            }
        }
        return -1;
    }
}
