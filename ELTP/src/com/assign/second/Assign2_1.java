package com.assign.second;

public class Assign2_1 {
public static boolean found(int[] arr, int n){
	for(int i:arr){
		if(i==n)
			return true;
	}
	return false;
}
public static int[] sort(int[] arr)
{
for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<arr.length;j++){
		if(arr[i]>arr[j])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
return arr;
}
}
																					