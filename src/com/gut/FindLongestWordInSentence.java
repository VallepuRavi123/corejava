package com.gut;

public class FindLongestWordInSentence {
//	Given a sentence, find the longest word.
//	Example:
//	Input:
//	str = "In Vcube, Java is simple"
//	Output:
//	simple
//	Constraint:
//	Ignore punctuation & Symbols

	public static void main(String[] args) {
		String str=" In Vcube, Java is simple ";
		str=str.replaceAll("[^a-zA-Z0-9]", " ");
		str=str.trim();
		System.out.println(str);
		String arr[]=str.split(" ");
		System.out.println(arr[0]);
		String max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>max.length()) {
				max=arr[i];
			}
		} 
		System.out.println(max);

	}

}
