package com.assign.one;

public class Great {

	public static int greatest(int a,int b,int c)
	{
		int n=a>b&&a>c?a:b>c?b:c;
		return n;
	}
}
