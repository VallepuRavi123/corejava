package com.operators;

public class MonkeyBanana {
	public static void main(String[] args) {
		boolean[]state= new boolean[3];
		display(state);
	}
	static boolean [] pushBox(boolean[] state) {
		state[0]=true;
		return state;
	}
	static boolean[]  climbBox(boolean[] state) {
		state[1]=true;
		return state;
	}
	static void grabBanana(boolean[] state) {
		state[2]=true;
//		return state;
	}
	static void displayArr(boolean[] state) {
		for(boolean i:state) {
			System.out.println(i+" ");
		}
	}
	static void display(boolean[] state){
		pushBox(state);
		System.out.println("The state after pushing the box is : ");
		displayArr(state);
		climbBox(state);
		System.out.println("The state after climbbox is ");
		displayArr(state);
		grabBanana(state);
		System.out.println("The state after banana grab is");
		displayArr(state);
	}

}
