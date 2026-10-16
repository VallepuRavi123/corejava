package com.dsa.strings;

import java.util.HashMap;

public class Targetsum {

	public static void main(String[] args) {
		int arr[]= {3,2,4};
		int target=6;
		HashMap<Integer,Integer>ans=new HashMap<>();
		int index=0;
		for(int i:arr) {
			ans.put(index,i);
			index++;
		}
		for(int i=0;i<arr.length;i++) {
			int req=target-arr[i];
			if(ans.containsValue(req)) {
				
			}
		}
	}

}
