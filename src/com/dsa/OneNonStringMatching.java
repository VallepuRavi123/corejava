package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneNonStringMatching {

	public static void main(String[] args) {
		String[] arr= {"banaca","apple","mango","banana","banaqa"};
		String s="banana";
		//System.out.println("hello");
		//int count=0;
		List<String>result=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			int count=0;
			if(arr[i].length()==s.length()) {
				for(int j=0;j<s.length();j++) {
				if(arr[i].charAt(j)!=s.charAt(j)) {
					count++;
				}
			}
				if(count==1) {
					//System.out.println(arr[i]);
					result.add(arr[i]);
				}
			}
		}
		System.out.println(result);
		}
	}





