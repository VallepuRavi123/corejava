package com.practice;

public class AccountHolderDetail {
	static int accno=12345;
	String holdername;
	String ifsc;
	{
		accno++;
	}
	void Details(){
		System.out.println(accno);
		System.out.println(holdername);
		System.out.println(ifsc);
		System.out.println("******************");
	}

	public static void main(String[] args) {
		AccountHolderDetail t=new AccountHolderDetail();
		//t.accno=12345;
		t.holdername="Ravi";
		t.ifsc="svi144";
		t.Details();
		AccountHolderDetail t1=new AccountHolderDetail();
		t1.holdername="baji";
		t1.ifsc="sbi234";
		t1.Details();
	}

}
