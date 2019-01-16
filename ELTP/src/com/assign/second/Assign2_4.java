package com.assign.second;

public class Assign2_4 {
	public static String[] wordReverse(String s) {
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String temp = "";
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				temp += arr[i].charAt(j);
			}
			arr[i] = temp;
		}
		return arr;

	}
}
