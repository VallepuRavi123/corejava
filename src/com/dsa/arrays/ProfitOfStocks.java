package com.dsa.arrays;

public class ProfitOfStocks {

	public static void main(String[] args) {
		int arr[]= {10,2,9,6,5,7,9,10};
		int max=0;
		int max1=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(max1<arr[j]-arr[i]) {
					max1=arr[j]-arr[i];
				}
				if(max<max1) {
					max=max1;
				}
			}
			max1=max;
		}
	}

}
