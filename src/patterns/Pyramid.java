package patterns;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value for n : ");
	int n=sc.nextInt();
	pyramid(n);
	
	sc.close();
	}
	static void pyramid(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<n-i-1) {
					System.out.print(" *");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
	
