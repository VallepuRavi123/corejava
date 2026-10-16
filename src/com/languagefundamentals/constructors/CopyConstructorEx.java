package com.languagefundamentals.constructors;

public class CopyConstructorEx { 
	String movieName;
	String language;
	double ticketPrice;
	CopyConstructorEx(String movieName,String language,double ticketPrice){
		this.language=language;
		this.movieName=movieName;
		this.ticketPrice=ticketPrice;
	}
	CopyConstructorEx(CopyConstructorEx m,double ticketPrice){
		this.language=m.language;
		this.movieName=m.movieName;
		this.ticketPrice=ticketPrice;
	}
	public void display(){
		System.out.println("Movie name is :"+movieName);
		System.out.println("Language of movie is :"+ language);
		System.out.println("Ticket price is : "+ticketPrice);
	}
	
	public static void main(String[] args) {
		CopyConstructorEx t=new CopyConstructorEx("toxic","telugu",150);
		t.display();
		CopyConstructorEx t2=new CopyConstructorEx(t,100);
		t2.display();
		
	}

}