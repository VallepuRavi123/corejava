package com.logicalconditions;

import java.util.Scanner;

public class PizzaEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pizza size : ");
		char size = sc.next().charAt(0);
		double price = getpizzaPrice(size);
		System.out.println(price);
		if (price == -1) {
			System.out.println("Invalid size");
		} else {

			System.out.println("Enter quantity : ");
			int n = sc.nextInt();
			price = calculatepizzacost(price, n);
			if(price<=0) {
				System.out.println("Invalid quantity");
			}
			else {
			System.out.println("Enter distance for delevary :");
			double km = sc.nextInt();
				double delevaryPrice = calculateDeliverycharge(km);
				if(delevaryPrice==-1) {
					System.out.println("Invalid distance");
				}
				else{
					System.out.println(calculateFinalBill(price, delevaryPrice));
				}

			}
		}
		
	}

	static double calculatepizzacost(double price, int quantity) {
//		double totalPrice;
		if (quantity < 0) {
			return -1;
		} else {
			price = price * quantity;
		}
		return price;
	}

	static double calculateDeliverycharge(double distance) {
		//double charge = 0;
		if (distance > 0 && distance < 10) {
			return 70;
		} else if (distance >= 11 && distance < 20) {
			return 100;
		} else if (distance >= 20) {
			return 150;
		}
		return -1;
	}

	static double getpizzaPrice(char size) {
		// double price=0;
		if (size == 's' || size == 'S') {
			return 70;
		} else if (size == 'm' || size == 'M') {
			return 100;
		} else if (size == 'l' || size == 'L') {
			return 150;
		}
		return -1;
	}

	static double calculateFinalBill(double pizzacost, double deliverycharge) {
		return pizzacost + deliverycharge;

	}
}
