package com.yingda.leetcode;

public class Solution206 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		ListNode node = reverseListRecursive(head);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	public static ListNode reverseListIterative(ListNode head) {
		ListNode prev = null, curr = head, temp;
		while (curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
//			System.out.println("temp " + (temp != null ? temp.val : ""));
//			System.out.println(" curr " + (curr != null ? curr.val : ""));
//			System.out.println(" prev " + (prev!= null ? prev.val : ""));
		}
		return prev;
	}
	public static ListNode reverseListRecursive(ListNode head) {
		if(head==null||head.next==null)return head;
		ListNode newHead=reverseListRecursive(head.next);
		head.next.next=head;
		head.next=null;
		return newHead;
	}
}
