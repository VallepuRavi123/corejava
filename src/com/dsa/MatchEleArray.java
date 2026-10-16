package com.dsa;

public class MatchEleArray {

	public static void main(String[] args) {
		int arr[]= {10,30,40,67};
		int arr2[]= {34,65,40,10};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr[i]==arr2[j]) {
					System.out.print(arr[i]+ " ");
					break;
				}
			}
		}
	}

}
