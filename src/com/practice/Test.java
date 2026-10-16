package com.practice;

public class Test {

	public static void main(String[] args) {
		/*
		 * // tring vcube=null; // System.out.println(vcube.isBlank()); //
		 * System.out.println(vcube.isEmpty()); // System.out.println(vcube.length());
		 * int arr[] = { 1, 2, 3, 4, 5, 11, 15 }; int target = 15; for (int i = 0; i <
		 * arr.length; i++) { for (int j = i+1; j < arr.length; j++) { if (arr[i] +
		 * arr[j] == target) { System.out.println("Found at position" + i + "and" + j);
		 * } }
		 * 
		 * } System.out.println("Element not found");
		 * 
		 * } }
		 */
		int arr[] = { 1,2,3,11,14,15};
		
		int  target=15;
		int left = 0, right = arr.length - 1;
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				System.out.println("Element found at position ;"+left +"and"+right);
				break;
			}
			else if(sum>target) {
				right--;
			}
			else if(sum<target) {
				left++;

			}
			else {
				System.out.println("Element not found");
			}
		}
	}
}
