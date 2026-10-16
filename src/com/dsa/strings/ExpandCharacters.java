package com.dsa.strings;

import java.util.Scanner;

public class ExpandCharacters {
	static String expandChar(String s) {//s=a1b2c3
		String result="";
		String s1="java";
		String s2="ja"+"va";
		String s3=s2+"va";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3);
		System.out.println(s3==s1);
		for(int i=0;i<s.length();i++) {
			int n=0;
			if(!Character.isDigit(s.charAt(i))) {
				continue;
			}
			if(Character.isDigit(s.charAt(i))){
				n=n*10+s.charAt(i);
			}
			//int n=Character.getNumericValue(s.charAt(i));
			int x=0;
			int j=0;
			while(j<=s.length()) {
				x+=j;
				if(!Character.isDigit(s.charAt(j))) {
					while(n>0) {
						result+=s.charAt(j);
						n--;
					}
					j++;
					break;
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.next();
		System.out.println("******************");
		System.out.println("The value for the string is :"+expandChar(s));
		sc.close();
	}

}
