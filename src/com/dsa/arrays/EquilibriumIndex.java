package com.dsa.arrays;

public class EquilibriumIndex {

	public static void main(String[] args) {
		int arr[] = { 1,3,5,2,2 };
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		int leftsum =0;

		int n = 0;
		boolean status1 = false;
		for (int i = 0; i < arr.length; i++) {
			boolean status = false;
			int rightsum = sum - leftsum - arr[i];
			if (leftsum == rightsum) {
				status = true;
				n = i;
			}
			leftsum += arr[i];
			if (status) {
				status1 = true;
				System.out.println(n);
			}
		}
		if (!status1) {
			System.out.println("Not found ");
		}

	}

}
