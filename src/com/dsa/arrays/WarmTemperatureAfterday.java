package com.dsa.arrays;

import java.util.Arrays;
import java.util.Stack;

public class WarmTemperatureAfterday {

	public static void main(String[] args) {
		//Input: temperatures = [30,38,30,36,35,40,28]
		
		//Output: [1,4,1,2,1,0,0]
		int arr[]= {30,38,30,36,35,19,18};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			//arr[i]=0;
			boolean status=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					status=false;
					arr[i]=count+1;
					break;
				}
				count++;
				
			}
			if(status) {
				arr[i]=0;
			}
			
		}
	System.out.println(Arrays.toString(arr));
	}

}
