package com.yingda.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution989 {

	public static void main(String[] args) {
		int[] A = new int[] { 1 };
		int K = 99;
		List<Integer> res = addToArrayForm(A, K);
		for (Integer i : res) {
			System.out.println(i);
		}
	}

	public static List<Integer> addToArrayForm(int[] A, int K) {
		LinkedList<Integer> res = new LinkedList();
		int  index = A.length - 1;
		while (K > 0 || index>=0) {
			int sum=K%10+(index>=0?A[index--]:0);
			K=K/10+(sum>=10?1:0);
			res.add(sum%10);
		}
		Collections.reverse(res);
		return res;
	}
}
