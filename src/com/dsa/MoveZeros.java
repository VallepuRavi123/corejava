package com.dsa;

import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter value for n : ");
		//int n=sc.nextInt();
		int[]arr= {0,0,2,3,0,4,0,5};
		int left=0;
		int right=1;
		while(left<right) {
			if(arr[left]==0 && arr[right]!=0) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right++;
				
			}
			else if(arr[left]==0 && arr[right]==0) {
				right++;
			}
			else{
				left++;
				right++;
			}
			if(right==arr.length) {
				break;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
