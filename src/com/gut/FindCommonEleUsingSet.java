package com.gut;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindCommonEleUsingSet {

	public static void main(String[] args) {
		int []arr1= {1,2,3,2,3};
		int []arr2= {4,5,6,2,3};
		int []arr3= {1,2,3,4,5,6};
		List<Integer>list=new ArrayList<>();
		HashSet<Integer>set1=new HashSet<>();
		HashSet<Integer>set=new HashSet<>();
		for(int i:arr1) {
			set.add(i);
		}
		for(int i:arr2) {
			if(set.contains(i)) {
				set1.add(i);
			}
		}
		System.out.println(set);
		System.out.println(set1);
		for(int i=0;i<arr3.length;i++) {
			if(set1.contains(arr3[i])) {
				list.add(arr3[i]);
			}
		}
		System.out.println(list);
	}

}
