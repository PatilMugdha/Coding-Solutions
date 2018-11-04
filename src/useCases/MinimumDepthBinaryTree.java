package useCases;

class MinimumDepthBinaryTree {
	// Definition for a binary tree node.
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}	
	
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        if(root.left!=null && root.right==null) return 1+minDepth(root.left);
        if(root.left==null && root.right!=null) return 1+minDepth(root.right);
        return Math.min(1+minDepth(root.right), 1+minDepth(root.left));    
    }  
}