package patterns;

import java.util.Scanner;

public class Inverse_Pyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for n : ");
		int n=sc.nextInt();
		inverse(n);
		sc.close();
	}
	public static void inverse(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<n-i-1) {
					System.out.print("*");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
