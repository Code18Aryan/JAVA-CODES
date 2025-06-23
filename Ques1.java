import java.util.*;


  class TreeNode{

       int val;
       TreeNode left;
       TreeNode right;

       TreeNode(int val){

           this.val = val;
           this.left = null;
           this.right = null;
       }
  }
public class Ques1 {


    public static TreeNode insertNode(TreeNode root, int val) {

        if (root == null) return new TreeNode(val);

        if (root.val > val) {

            root.left = insertNode(root.left, val);
        } else {

            root.right = insertNode(root.right, val);
        }

        return root;
    }

    public static void inorder(TreeNode root) {

        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(50);
        
        int [] nums = {35,6,34,23,667};

        for(int x : nums){

             insertNode(root,x);
        }

        inorder(root);



    }

}
