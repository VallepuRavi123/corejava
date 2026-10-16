package com.logicalconditions;

public class TernnaryEx {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=15;
		String max=(a>b && a>c)?a+"is big":(b>c)?b+"is big":c+"is big";
		System.out.println(max);
		System.out.println((a&1)==0?"even":"odd");
		
	}

}
