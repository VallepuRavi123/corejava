package com.gut;

public class FindDupplicateElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,5};
		int n=arr.length-1;
		int sum=n*(n+1)/2;
		int s=0;
		System.out.println(sum);
		for(int i:arr) {
			s+=i;
		}
		System.out.println(s-sum);
		

	}

}
