package com.assign.one;

public class HailStoneSequence {

public static int[] hailStone(int n) {
	int[] arr = new int[100];
	int i=0;
	do {
		if(n%2==0)
		{
			n=n/2;
			arr[i]=n;
			i++;
		}
		if(n%2!=0&&n!=1) {
			n=n*3+1;
			arr[i]=n;
			i++;
		}
	}while(n>1);
	arr[i]=n;
	return arr;
}
	
}
