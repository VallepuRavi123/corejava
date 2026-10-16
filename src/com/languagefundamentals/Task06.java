package com.languagefundamentals;

public class Task06 {
	String brandName;
	String watchType;
	int hours;
	int minutes;
	int seconds;
	int price;
	
	
	public void displayWatch() {
		System.out.println("The brand Name is "+brandName);
		System.out.println("The watch details is :"+watchType);
		System.out.println("The price of the watch is "+price);
		displayTime();
	}
	public void displayTime() {
		if(hours>=24) {
			hours-=24;
		}
		if(minutes>=60) {
			hours+=minutes/60;
			minutes=minutes%60;
		}
		System.out.println("The time of in the watch is "+hours+":"+minutes+":"+seconds);
		updatehours();
	}
	void updatehours() {
		hours++;
		System.out.println("One hour is added to the clock !");
		updateminutes();
		System.out.println("The time after updating is "+hours+":"+minutes+":"+seconds);
//		updateminutes();
	}
	void updateminutes() {
		minutes+=5;
		System.out.println("The 5 min time added to the clock ");
		if(hours>=24) {
			hours-=24;
		}
		if(minutes>=60) {
			hours-=24;
			hours+=minutes/60;
			minutes=minutes%60;
		}
	}

	public static void main(String[] args) {
		
		Task06 t=new Task06();
		t.brandName="xyz";
		t.watchType="abc";
		t.hours=24;
		t.minutes=80;
		t.seconds=20;
		t.price=100;
		t.displayWatch();
	}

}
