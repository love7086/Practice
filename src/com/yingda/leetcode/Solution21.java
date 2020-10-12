package com.yingda.leetcode;

public class Solution21 {

	public static void main(String[] args) {
		ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		ListNode node = mergeTwoLists(head1,head2);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1,ListNode l2) {
		ListNode curr=new ListNode(0),dummy=curr;
		while(l1!=null&&l2!=null) {
			if(l1.val<=l2.val) {
				curr.next=l1;
				l1=l1.next;
			}else {
				curr.next=l2;
				l2=l2.next;
			}
			curr=curr.next;
		}
		while(l1!=null) {
			curr.next=l1;
			l1=l1.next;
			curr=curr.next;
		}
		while(l2!=null) {
			curr.next=l2;
			l2=l2.next;
			curr=curr.next;
		}
		return dummy.next;
	}
}
