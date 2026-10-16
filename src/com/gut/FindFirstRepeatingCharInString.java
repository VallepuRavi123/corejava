package com.gut;

import java.util.HashMap;

public class FindFirstRepeatingCharInString {

	public static void main(String[] args) {
		String s="programming";
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			int count=map.getOrDefault(s.charAt(i), 0)+1;
			map.put(s.charAt(i), count);
			if(count==2) {
				System.out.println(s.charAt(i));
				break;
			}
		}
		
	}

}
