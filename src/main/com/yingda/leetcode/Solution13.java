package main.com.yingda.leetcode;

public class Solution13 {

	public static void main(String[] args) {
		String s="MCMXCIV";
		System.out.println(romanToInt(s));
	}

	public static int romanToInt(String s) {
		char[] chars = new char['x'];
		chars['I'] = 1;
		chars['V'] = 5;
		chars['X'] = 10;
		chars['L'] = 50;
		chars['C'] = 100;
		chars['D'] = 500;
		chars['M'] = 1000;
		int i = 0, result = 0,prev=chars[s.charAt(0)],curr;
		while (++i< s.length()) {
			curr=chars[s.charAt(i)];
			if (curr>prev) {
				result -= prev;
			} else {
				result += prev;
			}
			prev=curr;
		}
		result+=prev;
		return result;
	}
}
