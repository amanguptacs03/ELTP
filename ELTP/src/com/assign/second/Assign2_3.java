package com.assign.second;



public class Assign2_3 {

	public static String[] sortString(String s){
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++){
				if(arr[i].charAt(0) > arr[j].charAt(0))
				{
				String	temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
}
