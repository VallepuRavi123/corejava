package com.dsa.arrays;

public class FindMissingInSerious {

	public static void main(String[] args) {
		int arr[]= {1,5,6,8,9};
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]+1!=arr[i+1]) {
//				System.out.print(arr[i]+1+ " ");
//			}
//		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
//		
//		for(int i=0;i<arr.length;i++) {
//			boolean status=true;
//			for(int j=0;j<arr.length;j++) {
//				
//				if( i!=j && arr[i]+1!=arr[j]) {
//					//System.out.print(arr[i]+1+" ");
//					status=false;
//					break;
//				}
//			}
//			if(!status) {
//				System.out.print(arr[i]+1+" ");
//			}
//		}
		for(int i=0;i<arr.length-1;i++) {
			int start=arr[i];
			int end=arr[i+1];
			for(int j=start+1;j<end;j++) {
				System.out.print(j+" ");
			}
			}
		
	}

}
