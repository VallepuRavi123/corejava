package com.gut;

import java.util.LinkedHashSet;

public class RemoveDuplicatesOfString {
	public static void main(String[] args) {
		LinkedHashSet<Character> sr=new LinkedHashSet<>();
		String s="programming";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			boolean status=false;
			for(int k=0;k<i;k++) {
				if(s.charAt(i)==s.charAt(k)) {
					status=true;
				}
			}
			if(status) {
				continue;
			}
			else {
				System.out.println(s.charAt(i));
			}
		sr.add(s.charAt(i));
		}
		System.out.println(sr);
		for(char i:sr) {
			sb.append(i);
		}
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.toString());
	}
}

