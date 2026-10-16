package com.languagefundamentals;

public class TableReservation {
	int tableId;
	boolean status=false;
	int seats;
	public TableReservation(int seats,int tableId) {
		this.seats=seats;
		this.tableId=tableId;
	}

	public void reservetable() {
		System.out.println("The table is "+tableId+"is reserved !!!");
		status=true;
		cancelres();
	}
	public void cancelres() {
		if(status) {
			System.out.println("The table  cancels its reservation ");
			System.out.println("The table "+tableId+"is available");
		}
		else {
			System.out.println("without booking the table we cant cancel the table ");
		}
	}
	public void display() {
		System.out.println("The tables details are !!!");
		System.out.println("The table id is "+tableId);
		System.out.println("The available seats are "+seats);
		reservetable();
		//cancelres();
		
	}
	public static void main(String[] args) {
		TableReservation t=new TableReservation(123,10);
	//	TableReservation t1=new TableReservation();
//		t.tableId=123;
//		t.seats=10;
		t.cancelres();
	t.display();
	t.cancelres();
//		t1.tableId=456;
//		t1.seats=20;
//		t1.cancelres();
		
	}

}
