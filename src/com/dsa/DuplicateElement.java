package com.dsa;

public class DuplicateElement {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 5, 4, 4, 5,6,6,6 };
		String s="";
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && s.indexOf(Integer.toString(arr[i]))==-1) {
					s+=arr[i];
					}
				}
			}
			
		
		System.out.println(s);
	}}

