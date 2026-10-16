package com.languagefundamentals;

public class Task03 {
	int bookId;
	String bookName;
	String authorName;
	int copies;
	static String  libraryName="VCUBE";
	static String librarianName="SUBHAN";
	public Task03(int bookId,String bookName,String authorName,int  copies,String librarianName) {
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
		this.copies=copies;
		//this.librarianName=librarianName;
		
	}
	public void issuebook() {
		System.out.println("The book is issued sucessfully  !!!");
		copies-=1;
		System.out.println("The available copies after issue  the book is "+copies);
	}
	public void updatelibrain() {
		System.out.println("The librain name is "+librarianName);
	}
	public void display() {
		System.out.println("The library name is "+libraryName);
		System.out.println("The librarian name is "+librarianName);
		System.out.println("The book id is "+bookId);
		System.out.println("The book name is"+bookName);
		System.out.println("The author name is "+authorName);
		System.out.println("The avilable copies are"+copies);
		issuebook();
		updatelibrain();
		
		
	}

	public static void main(String[] args) {
		Task03 t=new Task03(123,"the art","james",10,"wdf");
		t.display();
		//Task03 t1=new Task03(456,"the art","james",10);
		//Task03 t1=new Task03();
//		t.bookId=123;
//		t.bookName="The Art";
//		t.authorName="James";
//		t.copies=10;
//		t.display();
//		t1.bookId=456;
//		t1.bookName="art";
//		t1.authorName="ravi";
//		t1.librarianName="Hari";
//		t1.display();
	}

}
