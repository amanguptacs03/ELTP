package com.assign.one;

public class HailStone {

	public static int[] hailstone(int n) {

		String str = n + " ";
		int count = 0;
		while (n != 1) {
			count++;
			if (n % 2 == 0) {
				n = n / 2;
				str += n + " ";

			} else {
				n = n * 3 + 1;
				str += n + " ";

			}

		}
		int[] arr = new int[(count + 1)];
		int j = 0;
		for (String i : str.split(" ")) {
			arr[j] = Integer.parseInt(i);
			j++;
		}

		return arr;
	}
}