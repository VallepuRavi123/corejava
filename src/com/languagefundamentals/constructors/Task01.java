package com.languagefundamentals.constructors;

public class Task01 {
	String EmpName;
	String companyName;
	double sal;
//	Task01(String EmpName,String companyName,double sal){
//		this.companyName=companyName;
//		this.EmpName=EmpName;
//		this.sal=sal;
//	}
//	Task01(){
//		EmpName="ravi";
//		companyName="xyz";
//		sal=20000;
//	}

	public static void main(String[] args) {
		Task01 t=new Task01();
		//Task01 t=new Task01("Baji","dell",120000);
		t.display("Baji","dell",120000);
		
		System.out.println(t.companyName);
		
		
	}


	void display(String EmpName,String companyName,double sal) {
		
		this.companyName=companyName;
		this.EmpName=EmpName;
		this.sal=sal;
	System.out.println("The name of the employee : "+EmpName);
	System.out.println("The company of the employee is : "+companyName);
	System.out.println("The sal of the employye is : "+sal);
	
	
	
}
}
