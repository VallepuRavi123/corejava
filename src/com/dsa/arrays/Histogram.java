package com.dsa.arrays;

class Histogram {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int maxarea=0;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			int area=0;
			int start=i+1;
			while(start<arr.length && arr[i]<=arr[start]) {
//				if(arr[i]<=arr[start]) {
					count++;
					start++;
//				}
//				else {
//					break;
//				}
			}
			int end=i-1;
			while(end>=0 && arr[i]<=arr[end]) {
//				if(arr[i]<=arr[end]) {
					count++;
					end--;
//				}
//				else {
//					break;
//				}
			}
			area=arr[i]*count;
			if(area>maxarea) {
				maxarea=area;
				index=i;
			}
		}
		System.out.println(index);
		System.out.println(arr[index]);
		System.out.println(maxarea);
	}

}
