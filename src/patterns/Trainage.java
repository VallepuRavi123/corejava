package patterns;

import java.util.Scanner;

public class Trainage {
	public static void main(String[] args) {
		System.out.println("Enter value for n :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*
		 * for(int i=0;i<n;i++) { for(int j=0;j<i;j++) { System.out.print("*"); }
		 * System.out.println(" "); } }
		 */
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		sc.close();
	}
}
