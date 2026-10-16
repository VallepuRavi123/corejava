package com.languagefundamentals;

public class CopyConstructorEx {
	String accHolderName;
	String accNo;
	double balance;
	String branch;
	
	CopyConstructorEx(String accHolderName,String accNo,double balance,String branch){
		this.accHolderName=accHolderName;
		this.accNo=accNo;
		this.balance=balance;
		this.branch=branch;
	}
	CopyConstructorEx(CopyConstructorEx m,double balance,String branch){
		accHolderName=m.accHolderName;
		accNo=m.accNo;
		this.balance=balance;
		this.branch=branch;
	}
	 public void display() {
		System.out.println("The name of the account holder is "+accHolderName);
		System.out.println("The account number is :"+accNo);
		System.out.println("balance is : "+balance);
		System.out.println("The branch of the account is : "+branch);
	}

	public static void main(String[] args) {
		CopyConstructorEx t=new CopyConstructorEx("Hari","12345678",100000,"kphb");
		t.display();
		CopyConstructorEx t2=new CopyConstructorEx(t,12345,"abc");
		t2.display();
	}

}
