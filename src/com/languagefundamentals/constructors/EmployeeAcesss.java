package com.languagefundamentals.constructors;

public class EmployeeAcesss {
	//employeeName, salary, doorpower, blocked
	String employeeName;
	double sal;
	boolean doorpower;
	boolean blocked;
	void checkstatus() {
		if(doorpower&&!blocked) {
		System.out.println("The employee name is "+employeeName);
		System.out.println("The employee salary is "+sal);
		System.out.println("The door power status is"+doorpower);
		System.out.println("The acess of the user is "+(doorpower&&!blocked));
		}
		else {
			System.out.println("Acess denined !!");
		}
	}
	EmployeeAcesss(String employeeName,double sal ,boolean doorpower, boolean blocked){
		this.doorpower=doorpower;
		this.blocked=blocked;
		this.employeeName=employeeName;
		this.sal=sal;
	}

	public static void main(String[] args) {
		EmployeeAcesss t=new EmployeeAcesss("Baji",10000,true,false);
		t.checkstatus();
	}

}
