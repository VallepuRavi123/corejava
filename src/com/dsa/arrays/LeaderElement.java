package com.dsa.arrays;

public class LeaderElement {

	public static void main(String[] args) {
		int arr[]= {12,100,82,45,11,0,7,90,9,6,3,1};
		for(int i=0;i<arr.length;i++) {
			boolean status=true;
			for(int j=i+1;j<arr.length;j++) {
				//boolean status=false;
				if(arr[i]<=arr[j]) {
					status=false;
					break;
				}
//				else {
//					status=true;
//					break;
//				}
			}
			if(status) {
				System.out.print(arr[i]+" ");
				
			}
			
		}
//		System.out.println(arr[arr.length-1]);
//		int j=arr.length-1;
//		int i=0;
//		while(i!=arr.length) {
//			if(arr[i]>arr[j]) {
//				j--;
//			}
//		
//			else if(i==j) {
//				System.out.println(arr[i]);
//				i++;
//				j=arr.length-1;
//			}
//			else {
//				i++;
//				j=arr.length-1;
//			}
//		}
//		int max=0;
//		for(int i=arr.length;i>=0;i--) {
//			if(arr[i]>max) {
//				
//			}
//		}
//			
		
	}

}
