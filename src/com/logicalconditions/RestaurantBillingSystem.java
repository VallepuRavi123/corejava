package com.logicalconditions;

import java.util.Scanner;

public class RestaurantBillingSystem {
	static {
		System.out.println("****************WELCOME TO THE RESTAURANT******************");
		//System.out.println("------------------------------------------------------------");
	}
	static double totalBill;
	static double priceforveg;
	//static int quantityofveg;
	static double pricefornonveg;
	static double priceforcooldrinks;
	static double pricefordeserts;
	// static double quantity;
	static String s;
//	static int q1 = 0;
//	static int q2 = 0;
//	static int q3 = 0;
//	static int q4 = 0;
//	static int q5 = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("********** MENU *****************");
			System.out.println("1.VEG ITEMS");
			System.out.println("2.NON VEG ITEMS");
			System.out.println("3.COOL DRINKS ");
			System.out.println("4.DESERT ");
			System.out.println("********************");
			System.out.println("Select your choice !!");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> {
				showvegMenu(sc);
			}
			case 2 -> {
				showNonvegMenu(sc);
			}
			case 3 -> {
				showCoolDrinksMenu(sc);
			}
			case 4 -> {
				showDesertMenu(sc);
			}
			default -> {
				System.out.println("Enter a valid choice ");
			}
			}
			System.out.println("Do you want to continue please click Yes for exit click No : ");
			s = sc.next();
		} while (s.equalsIgnoreCase("yes"));
		totalBill = priceforveg + pricefornonveg + priceforcooldrinks + pricefordeserts;
		System.out.println("-------------------The Bill is--------------------------");
		System.out.println("The Veg items price is----------------------"+priceforveg);
		System.out.println("The non Veg items price is -----------------"+pricefornonveg);
		System.out.println("The Cool Drink items price is---------------"+priceforcooldrinks);
		System.out.println("The Deserts items price is -----------------"+pricefordeserts);
		System.out.println("The total Bill for the customer is---------" + totalBill);
		sc.close();
	}

	static void showvegMenu(Scanner sc) {
		System.out.println("THE VEG ITEMS ARE : ---------Prices");
		System.out.println("1.Paneer Butter Masala 🧀------200");
		System.out.println("2.Veg Biryani 🍚---------------150");
		System.out.println("3.Paneer Tikka 🍢--------------250");
		System.out.println("4.Veg Fried Rice 🍚------------100");
		System.out.println("5.Gobi Manchurian🥦---------------70");
		int q1=0,q2=0,q3=0,q4=0,q5=0;
		double price1 = 0;
		do {

			System.out.println("Enter your choice : ");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> {
				System.out.println("Panner Butter Masala Added !!");
				System.out.println("Please Enter Quantity : ");
			q1 = sc.nextInt();
				price1 += q1 * 200;
			}
			case 2 -> {
				System.out.println("Veg Biryani added !!");
				System.out.println("Please Enter Quantity : ");
				q2 = sc.nextInt();
				price1 += q2 * 150;
			}
			case 3 -> {
				System.out.println("Panner Tikka added !!");
				System.out.println("Please Enter Quantity : ");
				 q3 = sc.nextInt();
				price1 += q3 * 250;
			}
			case 4 -> {
				System.out.println("Veg Fried Rice Added !!");
				System.out.println("Please Enter Quantity : ");
				 q4 = sc.nextInt();
				price1 += q4 * 100;
			}
			case 5 -> {
				System.out.println("Gobi Manchuryan Added !!");
				System.out.println("Please Enter Quantity : ");
				 q5 = sc.nextInt();
				price1 += q5 * 70;
			}
			default -> {
				System.out.println("Enter a valid choice !!");
			}
			}
			System.out.println("Do you want to continue the order click Yes for exit click No");
			System.out.println("-------------------------------------------------------------");
			s = sc.next();
		} while (s.equalsIgnoreCase("yes"));
		priceforveg += price1;
		System.out.println("The Price of the VegItems is :---------price");
		System.out.println("panner Butter Masala - " + q1 + "-->" + q1 * 200);
		System.out.println("veg Biryani ---------- " + q2 + "-->" + q2 * 150);
		System.out.println("Paneer Tikka---------- " + q3 + "-->" + q3 * 250);
		System.out.println("Veg Fried Rice-------- " + q4 + "-->" + q4 * 100);
		System.out.println("Gobi Manchuryan----- - " + q5 + "-->" + q5 * 70);
		System.out.println("-------------------------------------------------------------");
		System.out.println("The total price of the Veg Items---" + priceforveg);

	}

	static void showNonvegMenu(Scanner sc) {
		System.out.println("THE NON-VEG ITEMS ARE : ---------Prices");
		System.out.println("1.Chicken Biryani 🍗--------------200");
		System.out.println("2.Butter Chicken 🍛---------------150");
		System.out.println("3.Chicken 65 🌶️🍗-----------------300");
		System.out.println("4.Chicken Fried Rice 🍚🍗---------100");
		System.out.println("5.Tandoori Chicken 🔥🍗-----------270");
		System.out.println("-------------------------------------------------------------");
		int q1=0,q2=0,q3=0,q4=0,q5=0;
		double price1 = 0;
		do {
			System.out.println("Enter your choice : ");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> {
				System.out.println("Chicken Biryani Added !!");
				System.out.println("Please Enter Quantity : ");
				q1 = sc.nextInt();
				price1 += q1 * 200;
			}
			case 2 -> {
				System.out.println("Butter Chicken  added !!");
				System.out.println("Please Enter Quantity : ");
				q2 = sc.nextInt();
				price1 += q2 * 150;
			}
			case 3 -> {
				System.out.println("Chicken 65 added !!");
				System.out.println("Please Enter Quantity : ");
				q3 = sc.nextInt();
				price1 += q3 * 300;
			}
			case 4 -> {
				System.out.println("Chicken Fried Rice  Added !!");
				System.out.println("Please Enter Quantity : ");
				q4 = sc.nextInt();
				price1 += q4 * 100;
			}
			case 5 -> {
				System.out.println("Tandoori Chicken Added !!");
				System.out.println("Please Enter Quantity : ");
				q5 = sc.nextInt();
				price1 += q5 * 270;
			}
			default -> {
				System.out.println("Enter a valid choice !!");
			}
			}
			System.out.println("Do you want to continue the order click Yes for exit click No");
			System.out.println("-------------------------------------------------------------");
			s = sc.next();
		} while (s.equalsIgnoreCase("yes"));
		pricefornonveg+=price1;
		System.out.println("The Price of the Non VegItems is :-------price");
		System.out.println("Chicken Biryani------- " + q1 + "---------->" + q1 * 200);
		System.out.println("Butter Chicken  ------ " + q2 + "---------->" + q2 * 150);
		System.out.println("Chicken 65 ----------- " + q3 + "---------->" + q3 * 300);
		System.out.println("Chicken Fried Rice-----" + q4 + "----------->" + q4 * 100);
		System.out.println("Tandoori Chicken----- -" + q5 + "----------->" + q5 * 270);
		System.out.println("-------------------------------------------------------------");
		System.out.println("The total price of the Non-Veg Items-----" +pricefornonveg );
		System.out.println("-------------------------------------------------------------");
	}

	static void showCoolDrinksMenu(Scanner sc) {
		System.out.println("THE COOL DRINK ITEMS ARE : ---------Prices");
		System.out.println("1.Coca-Cola 🥤-------------------------70");
		System.out.println("2.Sprite 🍋🥤-------------------------100");
		System.out.println("3.Fanta 🍊🥤---------------------------90");
		System.out.println("4.Thums Up----------------------------100");
		System.out.println("5.Lemon Soda 🍋🫧----------------------50");
		double price1 = 0;
		int q1=0,q2=0,q3=0,q4=0,q5=0;
		do {
			System.out.println("Enter your choice : ");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> {
				System.out.println("Coco-Cola Added !!");
				System.out.println("Please Enter Quantity : ");
				q1 = sc.nextInt();
				price1 += q1 * 70;
			}
			case 2 -> {
				System.out.println("Sprite  added !!");
				System.out.println("Please Enter Quantity : ");
				q2 = sc.nextInt();
				price1 += q2 * 100;
			}
			case 3 -> {
				System.out.println("Fanta added !!");
				System.out.println("Please Enter Quantity : ");
				q3 = sc.nextInt();
				price1 += q3 * 90;
			}
			case 4 -> {
				System.out.println("Thums-Up  Added !!");
				System.out.println("Please Enter Quantity : ");
				q4 = sc.nextInt();
				price1 += q4 * 100;
			}
			case 5 -> {
				System.out.println("Lemon Soda Added !!");
				System.out.println("Please Enter Quantity : ");
				q5 = sc.nextInt();
				price1 += q5 * 50;
			}
			default -> {
				System.out.println("Enter a valid choice !!");
			}
			}
			System.out.println("Do you want to continue the order click Yes for exit click No");
			System.out.println("-------------------------------------------------------------");
			s = sc.next();
		} while (s.equalsIgnoreCase("yes"));
		priceforcooldrinks+=price1;
		System.out.println("The Price of the cool drink is :---------price");
		System.out.println("Coca-Cola------------- " + q1 + "-->" + q1 * 70);
		System.out.println("Sprite---------------- " + q2 + "-->" + q2 * 100);
		System.out.println("Fanta----------------- " + q3 + "-->" + q3 * 90);
		System.out.println("Thums-up---------------" + q4 + "-->" + q4 * 100);
		System.out.println("Lemon-Soda----------- -" + q5 + "-->" + q5 * 50);
		System.out.println("The total price of the cooldrink Items---" + priceforcooldrinks);
		System.out.println("-------------------------------------------------------------");

	}

	static void showDesertMenu(Scanner sc) {
		System.out.println("THE DESERT ITEMS ARE : ---------Prices");
		System.out.println("1.Chocolate Brownie 🍫------------100");
		System.out.println("2.Ice Cream Sundae 🍨-------------100");
		System.out.println("3.Chocolate Cake 🍰---------------100");
		System.out.println("4.Gulab Jamun 🍯-------------------50");
		System.out.println("5.Waffles with Ice Cream 🧇🍦------200");
		double price1=0;
		int q1=0,q2=0,q3=0,q4=0,q5=0;
		do {
			System.out.println("Enter your choice : ");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> {
				System.out.println("Chocolate Brownie Added !!");
				System.out.println("Please Enter Quantity : ");
				q1 = sc.nextInt();
				price1+= q1 * 100;
			}
			case 2 -> {
				System.out.println("Ice Cream Sundae  added !!");
				System.out.println("Please Enter Quantity : ");
				q2 = sc.nextInt();
				price1 += q2 * 100;
			}
			case 3 -> {
				System.out.println("Chocolate Cake added !!");
				System.out.println("Please Enter Quantity : ");
				q3 = sc.nextInt();
				price1 += q3 * 100;
			}
			case 4 -> {
				System.out.println("Gulab Jamun Rice  Added !!");
				System.out.println("Please Enter Quantity : ");
				q4 = sc.nextInt();
				price1 += q4 * 50;
			}
			case 5 -> {
				System.out.println("Waffles with Ice Cream  Added !!");
				System.out.println("Please Enter Quantity : ");
				q5 = sc.nextInt();
				price1 += q5 * 200;
			}
			default -> {
				System.out.println("Enter a valid choice !!");
			}
			}
			System.out.println("Do you want to continue the order click Yes for exit click No");
			System.out.println("-------------------------------------------------------------");
			s = sc.next();
		} while (s.equalsIgnoreCase("yes"));
		pricefordeserts+=price1;
		System.out.println("The Price of the cool drink is :-----------------price");
		System.out.println("Chocolate Brownie---------------" + q1 + "-->" + q1 * 100);
		System.out.println("Ice Cream Sundae----------------" + q2 + "-->" + q2 * 100);
		System.out.println("Chocolate Cake----------------- " + q3 + "-->" + q3 * 100);
		System.out.println("Gulab Jamun---------------------" + q4 + "-->" + q4 * 50);
		System.out.println("Waffles with Ice Cream----------" + q5 + "-->" + q5 * 200);
		System.out.println("The total price of the Veg Items--------------" + pricefordeserts);


	}
}
