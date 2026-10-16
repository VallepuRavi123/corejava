package patterns;

import java.util.Scanner;

public class Numbers_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for n : ");
		int n=sc.nextInt();
		traingle(n);
		
		sc.close();
	}
	static void traingle(int n) {
		int a=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a+" ");
			}
			a++;
			System.out.println();
		}
	}

}
