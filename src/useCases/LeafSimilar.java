package useCases;

import java.util.ArrayList;
import java.util.List;

class Solution {

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		getLeaves(root1, list1);
		getLeaves(root2, list2);
		if (list1.size() != list2.size()) {
			return false;
		} else {
			for (int i = 0; i < list1.size(); i++) {
				if (list1.get(i) != list2.get(i)) {
					return false;
				}
			}
		}

		return true;
	}

	public void getLeaves(TreeNode node, List<Integer> list) {
		if (node.left == null && node.right == null) {
			list.add(node.val);
			return;
		}

		if (node.left != null) {
			getLeaves(node.left, list);
		}

		if (node.right != null) {
			getLeaves(node.right, list);
		}

	}
}
