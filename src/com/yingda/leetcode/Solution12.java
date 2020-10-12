package com.yingda.leetcode;

import java.util.HashMap;

public class Solution12 {

	public static void main(String[] args) {
		int i=1994;
		System.out.println(intToRoman(i));
	}

	public static String intToRoman(int num) {
		StringBuffer sb=new StringBuffer();
		int tmp=num;
		int[] arr=new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		HashMap<Integer,String> map=new HashMap<Integer, String>();
		map.put(1000, "M");
		map.put(900,"CM");
		map.put(500, "D");
		map.put(400,"CD");
		map.put(100, "C");
		map.put(90,"XC");
		map.put(50, "L");
		map.put(40,"XL");
		map.put(10, "X");
		map.put(9,"IX");
		map.put(5, "V");
		map.put(4,"IV");
		map.put(1,"I");
		for(int i=0;i<arr.length;) {
			if(tmp>=arr[i]) {
				sb.append(map.get(arr[i]));
				tmp-=arr[i];
			}else {
				i++;
			}
		}
		return sb.toString();
	}
}
