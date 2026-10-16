package com.dsa.arrays;

public class GutEx {
	//********************question 1***********************************//
	/* int x=10;
	GutEx(){
		System.out.println(this.x);
	}
	 public String toString() {
		System.out.println("\"toString\"");
		return  ""+ ++x;
	}
	public static void main(String[] args) {
		GutEx t=new GutEx();
		System.out.println(t);
		
	}*/
	//***********************question 2*******************************//
	/*static int count=0;
	GutEx(){
		count++;
	}
	protected void finalize() throws Throwable {
	    System.out.println("Finalize method called !!");
	}
	public static void main(String[] args) {
		GutEx t1=new GutEx();
		GutEx t2=new GutEx();
		GutEx t3=new GutEx();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		t1=t2;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		t2=t3;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		t3=null;
		//new GutEx();
		System.out.println(count);
		System.gc();
	}*/
	//***********************question 3*********************************//
/*	static int x=value();
	GutEx(){
		System.out.println("Constructor called !!!");
		System.out.println(x);
	}
	static int value() {
		System.out.println("method called");
		return 100;
	}
	public static void main(String[] args) {
		//new GutEx();
	}
	*/
	//******************************************************//
	/*GutEx(int x){
		System.out.println("A");
	}
	GutEx(Integer x){
		System.out.println("B");
	}
	public static void main(String[] args) {
		boolean[] b=new boolean[5];
		boolean[] b1=new boolean[5];
		System.out.println(b[0]);
		System.out.println(b1[0]);
		int[]arr= {4,2,3};
		arr[0]=arr[0]++;
		System.out.println(arr[0]);
		System.out.println("************************");
		new GutEx(null);
		
	}*/
	//********************************************************//
	protected void finalize() throws Throwable {
	    System.out.println("Finalize method called !!");
	}
	public static void main(String[] args) {
		GutEx t1=new GutEx();
		GutEx t2=t1;
		GutEx t3=t2;
		t1=null;
		t2=null;
		t3=null;
		System.gc();
	}
//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			System.out.println(i++ +" ");
//		}
//		int i=5;
//		while(i-->0) {
//			System.out.println(i+" ");
//		}
//	}
}
