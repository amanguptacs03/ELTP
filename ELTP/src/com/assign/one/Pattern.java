package com.assign.one;

import java.io.IOException;


/*public class Pattern {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	for(int i=1;i<=n/2+1;i++) {
		for(int j=1;j<=n/2+1-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print(2*i-1);
			
		}
		System.out.println("");
	}
}
}*/


public class Pattern{
	public static void main(String[] args) throws IOException {
		int r=(System.in.read()-48)/2+1;
		for(int i=1;i<=r;i++)
		{
			String a="";
			for(int j=1;j<=2*i-1;j++){
				a=a+(2*i-1);
			}
			System.out.println(String.format("%"+(r+i-1)+"s",a));
		}
		
	}
}
