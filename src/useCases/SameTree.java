package useCases;

// Definition for a binary tree node.
 
public class SameTree {
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isLeft=true, isRight=true;

        if(p==null && q==null) return true;

        if((p==null && q!=null) || (p!=null && q==null)) return false;
     
        if(p.val!=q.val) return false;
        
        isLeft = isSameTree(p.left, q.left);
        isRight = isSameTree(p.right, q.right);
        
        return isLeft && isRight;
    }
        
}
