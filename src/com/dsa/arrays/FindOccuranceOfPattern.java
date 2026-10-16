package com.dsa.arrays;

public class FindOccuranceOfPattern {

	public static void main(String[] args) {
		String text= "AABAACAADAABAABA";
		String pattern="AABA";
		for(int i=0;i<=text.length()-pattern.length();i++) {
			if(text.substring(i, i+pattern.length()).equals(pattern)) {
				System.out.println(i+ " ");
			}
		}
	}
}