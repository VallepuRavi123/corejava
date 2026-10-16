package com.logicalconditions;

import java.util.Scanner;

public class Alphabet {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a='A';
		char b='a';
		for(int i=1;i<=26;i++) {
			if(i%2==0) {
				System.out.print(a+" ");
			}
			a++;
		}
		System.out.println();
		for(int i=1;i<=26;i++) {
			if(i%2==0) {
				System.out.print(b+" ");
			}
			b++;
		}

	}

}
