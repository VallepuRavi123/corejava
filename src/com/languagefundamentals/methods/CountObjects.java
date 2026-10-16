package com.languagefundamentals.methods;

public class CountObjects {
	int age;
	String name;
	static int count=0;
	CountObjects(){
		count++;
	}
	CountObjects(int age,String name){
		count++;
		//show(age,name);
	}

	public static void main(String[] args) {
		CountObjects c=new CountObjects();
		CountObjects c1=new CountObjects();
		CountObjects c2=new CountObjects();
		CountObjects c3=new CountObjects();
		CountObjects c4=new CountObjects(20,"hari");
		CountObjects c5=new CountObjects(30,"baji");
		System.out.println(count);
//		System.out.println(c4.age);
//		System.out.println(c5.age);

	}
//	void show(int age,String name) {
//		this.age=age;
//		System.out.println(name);
//		System.out.println(age);
//	}

}
