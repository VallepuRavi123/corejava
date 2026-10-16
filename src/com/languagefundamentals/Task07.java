package com.languagefundamentals;

public class Task07 {
	String employeeName;
	int empoyeeId;
	String designation;
	String department;
	double salary;
	String loc;
	{
		System.out.println("Welcome to SunTech Solutions! Employee HRMS Portal");
	}
	void dispay() {
		System.out.println("The emp name is "+employeeName);
		System.out.println("The emp id is "+empoyeeId);
		System.out.println("The employee designation is "+designation);
		System.out.println("The department of the emplooyee is "+department);
		System.out.println("The salary of the employee is "+salary);
		System.out.println("The location of the employee is "+loc);
		System.out.println("******************************************");
		pramote("manager");
		
	}
	void pramote(String designation) {
		System.out.println("The employee designation after pramotion is"+designation);
	}
	void updatesalary(double salary) {
		this.salary+=5000;
		System.out.println("The salary after updating for the employee is"+salary);
	}
	void updateloc(String loc) {
		this.loc=loc;
		System.out.println("The location after update is"+loc);
		System.out.println("********************************************");
	}

	public static void main(String[] args) {
		Task07 t=new Task07();
		t.designation="clerk";
		t.employeeName="Hari";
		t.empoyeeId=123;
		t.department="xyz";
		t.salary=20000;
		t.loc="hyd";
		t.dispay();
		//t.pramote("Manager");
		//t.updatesalary(t.salary);
		//t.updateloc("vjd");
		t.dispay();
		
	}

}

//employeeName, employeeId, designation, department, salary, remoteLocation 
