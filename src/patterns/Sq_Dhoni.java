package patterns;

import java.util.Scanner;

public class Sq_Dhoni {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for n : ");
		int n=sc.nextInt();
		String s="DHONI";;
		char ch=65;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j | i+j==n-1) {
					System.out.print(s.charAt(i)+" ");
				}
				else {
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
