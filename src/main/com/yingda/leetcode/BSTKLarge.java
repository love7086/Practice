package main.com.yingda.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BSTKLarge {

	public static void main(String[] args) {
//			4
//		2		5
//	1	  3	
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		List<Integer> res = postorderTraversal(root);
		for (Integer i : res) {
			System.out.println(i);
		}
		System.out.println(Kth(root, 3));
	}

	public static List<Integer> postorderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack();
		TreeNode curr = root;
		List<Integer> list = new LinkedList();
		while (curr != null || !s.isEmpty()) {
			while (curr != null) {
				s.push(curr);
				curr = curr.right;
			}
			curr = s.pop();
			list.add(curr.val);
			curr = curr.left;
		}
		return list;
	}

	public static Integer Kth(TreeNode root, int k) {
		Stack<TreeNode> s = new Stack();
		TreeNode curr = root;
		while (curr != null || !s.isEmpty()) {
			while (curr != null) {
				s.push(curr);
				curr = curr.right;
			}
			curr = s.pop();
			if (--k == 0)
				return curr.val;
			curr = curr.left;
		}
		return -1;
	}
}
