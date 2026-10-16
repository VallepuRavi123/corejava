package patterns;

import java.util.Scanner;

public class Validparanthasis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='('&& s.charAt(i+1)==')') {
				System.out.println("True:");
				break;
			}
			else {
				System.out.println("False:");
				break;
			}
		}
		sc.close();
	}
}