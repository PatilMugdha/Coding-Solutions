package useCases;

import java.util.ArrayList;
import java.util.List;

//runs in 0ms
class KthSmallestElementBST {
	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int kthSmallest(TreeNode root, int k) {
		List<Integer> lst = new ArrayList<Integer>();
		traverse(root, lst, k);
		return lst.get(k - 1);
	}

	public void traverse(TreeNode root, List<Integer> lst, int k) {
		if (root == null)
			return;
		traverse(root.left, lst, k);
		if (lst.size() < k) {
			lst.add(root.val);
		} else {
			return;
		}
		traverse(root.right, lst, k);
	}
}
