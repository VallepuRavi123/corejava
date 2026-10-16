package com.dsa.strings;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String s="gbcdaarr";//abijrv;
		String s2="dcbaarrg";//abjvrr;
		char[] arr1=s.toCharArray();
//		int[] a= {1,4,3,5}; 
//		Arrays.sort(a);
//		String z=Arrays.toString(a);
//		System.out.println(z);
//		for(char i:z.toCharArray()) {
//			System.out.print(i+" ");
//		}
		Arrays.sort(arr1);
		System.out.println(arr1);
		char[] arr2=s2.toCharArray();
		Arrays.sort(arr2);
		System.out.println(anagram(arr1,arr2));
//		Test a=new Test();
//		a.main(args);

	}
	static boolean anagram( char[] s,char[] t) {
		for(int i=0;i<s.length;i++) {
			if(s[i]!=t[i]) {
				return false;
			}
		}
		return true;
	}
	}
class Test {
	public void main(String[] args) {
		System.out.println("class test called !!");
		Test2 b=new Test2();
		b.main(null);
	}
	class Test2{
		public  void main(String[] args) {
			System.out.println("class test2 called !!");
		}
}}
//class Test2{
//	public static void main(String[] args) {
//		System.out.println("class test2 called !!");
//	}
//}