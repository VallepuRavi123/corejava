package com.dsa.arrays;

public class FrequencyOfArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,10,20,30,10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			boolean status =false;
			int count=1;
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					status=true;
					break;
				}
			}
			if(status) {
				continue;
			}
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
	}

}
