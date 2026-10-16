package com.gut;

import java.util.HashMap;

public class TargetSumUsingHashMap {

	public static void main(String[] args) {
		//1. write a Java program using HashMap 
		//to find all pairs in an array whose sum equals a given value.
		//Input:  = [1, 5, 7, -1, 5], sum = 6
		//	Output: (1, 5), (7, -1), (1, 5)
		int []arr= {1, 5, 7, -1, 5};
		int []arr2=new int[2];
		int target=6;
		HashMap<Integer,Integer>map=new HashMap<>();
		HashMap<Integer,Integer>map1=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int req=target-arr[i];
			if(map.containsKey(req)) {
				System.out.println(req+" "+arr[i]);
				arr2[0]=map.get(req);
				arr2[1]=i;
				
			}
			map.put(arr[i],i);
		}
		System.out.println(arr2[0]);
		
		//System.out.println(map1);
	}

}
