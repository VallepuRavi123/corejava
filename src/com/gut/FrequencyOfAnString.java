package com.gut;

import java.util.HashMap;

public class FrequencyOfAnString {

	public static void main(String[] args) {
		String s="banana";
		
//		for(int i=0;i<s.length();i++) {
//			boolean status=false;
//			int count=1;
//			for(int k=0;k<i;k++) {
//				if(s.charAt(k)==s.charAt(i)) {
//					status=true;
//				}
//			}
//			if(status) {
//				continue;
//			}
//			for(int j=i+1;j<s.length();j++) {
//				if(s.charAt(i)==s.charAt(j)) {
//					count++;
//				}
//			}
//			System.out.println(s.charAt(i)+" " +count);
//		}
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
//			map.put(s.charAt(i), i);
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
		}
		System.out.println(map.values());
		System.out.println(map);
	}

}
