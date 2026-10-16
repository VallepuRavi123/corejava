package com.dsa.arrays;

public class MeadianOfTwoArrays {

	public static void main(String[] args) {
		int[] arr2 = { 1, 2, 3, 4, 5 };
		int[] arr1 = { 6,7, 8, 9,10,11,12,13,14};
		int middle_index;
		double median;
		//double median = median(arr1, arr2);
		//System.out.println(median);
		if(arr1.length<arr2.length) {
			middle_index=arr2.length-arr1.length;
			if(middle_index%2==0) {
			 median=(double)(arr2[(middle_index-1)/2]+arr2[((middle_index-1)/2)+1])/2;
			}
			else
			median=arr2[(middle_index-1)/2];
		}
		else {
			middle_index=arr1.length-arr2.length;
			if(middle_index%2==0) {
				 median=(double)(arr1[(middle_index-1)/2]+arr1[((middle_index-1)/2)+1])/2;
				}
			else
			median=arr1[(middle_index-1)/2];
		}
		System.out.println(median);
	}

	static double median(int arr1[], int arr2[]) {
		int[] arr3 = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		double median=0; //= arr3[(arr3.length-1) / 2];
		if(arr3.length%2==0) {
			median=(double)(arr3[(arr3.length-1)/2]+arr3[((arr3.length-1)/2)+1])/2;
		}
		else {
			median=arr3[(arr3.length-1) / 2];
		}
	
	 return median;
	}
	

}
