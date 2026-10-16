package com.dsa.arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 5 ,5,7};
		for (int i = 0; i < arr.length; i++) {
			boolean status = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					status = true;
					break;
				}
			}
			if (!status) {
				System.out.println(arr[i] + " ");
			}
		}

	}

}
