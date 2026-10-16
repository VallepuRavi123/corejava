package com.dsa.arrays;

import java.util.HashSet;

public class PairsSum {

	public static void main(String[] args) {
		int[]arr= {7,0,1,4,3,6,5,7};
		int target=7;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==target) {
//					System.out.println(arr[i]+" "+arr[j]);
//				}
//			}
//			
//		}
		HashSet<Integer>set=new HashSet<>();
		HashSet<String>pair=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			int required=target-arr[i];
			if(set.contains(required)) {
				int first=Math.min(arr[i], required);
				int last=Math.max(arr[i], required);
				String s=first+" "+last;
				if(pair.add(s)) {
					System.out.println(first+" "+last);
				}
			}
			set.add(arr[i]);
		}
	}

}
