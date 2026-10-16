package com.dsa.arrays;

public class ElementFrequencyGreaterHalfLength {

	public static void main(String[] args) {
		int[] arr = {3,3,3,-1,-1,-1,-1};
		boolean arr1[] = new boolean[arr.length];
		int n = -1;
		boolean status=false;
		for (int i = 0; i < arr.length; i++) {
			if (arr1[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr1[j] = true;
					count++;
				}
			}
			if (count > arr.length / 2) {
				n = arr[i];
				status=true;
			}
		}

		if (status) {
            System.out.println(n);
		}else {
			System.out.println("no element found ");
		}

	}

}
