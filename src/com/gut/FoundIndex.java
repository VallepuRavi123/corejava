package com.gut;
public class FoundIndex {
	static int sum(int []arr,int left,int right) {
		int sum=0;
		while(left<right) {
			sum+=arr[left];
			left++;
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
//		int left=0;
//		int right=arr.length;
//		int mid=(left+right)/2;
//		while(mid!=left && mid !=right) {
//			int s1=sum(arr,left,mid);
//			int s2=sum(arr,mid+1,right);
//		if(s1==s2) {
//			System.out.println(mid);
//			break;
//		}
//		else if (s1<s2) {
//			mid++;
//		}
//		else {
//			mid--;
//		}
//		
//	}
		int leftsum=0;
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		for(int i=0;i<arr.length;i++) {
			int rightsum=sum-leftsum-arr[i];
			if(leftsum==rightsum) {
				System.out.println(i);
				break;
			}
			leftsum+=arr[i];
		}
	}
}
