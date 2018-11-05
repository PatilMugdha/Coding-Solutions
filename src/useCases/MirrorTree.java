package useCases;

class MirrorTree {
	
	//  Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
    public TreeNode invertTree(TreeNode root) {
       if(root==null) return null;
       if(root.left==null && root.right==null) {
            return root;
       }
       swap(root.left,root.right, root);
       invertTree(root.left);
       invertTree(root.right);
       return root;
    }
    
    public void swap(TreeNode left, TreeNode right, TreeNode root){
        TreeNode temp=new TreeNode(0);
        temp=left;
        left=right;
        right=temp;
        root.left=left;
        root.right=right;
    }
}
