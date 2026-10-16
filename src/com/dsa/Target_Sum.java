package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Target_Sum {
	static List<int[]> target(int[] arr,int target) {
	//	Arrays.sort(arr);
		boolean status=false;
		int left=0;
		int right=arr.length-1;
		//int sum=arr[left]+arr[right];
		List<int[]> ans=new ArrayList<>();
		int[] result=new int[2];
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				status=true;
				System.out.println(arr[left]+" + "+arr[right]+ " = "+sum);
				ans.add(new int[] {left,right});
				
				left++;
				right--;
				
			}
			else if(sum<target) {
				left++;
			}
			else {
				right--;
			}
			
			//int [] result= {left,right};
			
		}
		if(status==false) {
			System.out.println("pair not found !!");
		}
	//	int [] result= {left,right};
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter sum target value : ");
		int target=sc.nextInt();
			

		for (int i[] : target(arr,target)) {
			System.out.println(Arrays.toString(i));
		}

	}

}
