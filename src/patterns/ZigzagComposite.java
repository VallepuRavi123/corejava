package patterns;

import java.util.Scanner;

public class ZigzagComposite {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				
				while(k>0) {
				if(!iscomposite(k)) {
					System.out.print(k+" ");
					k++;
					break;
				}
				k++;
			}
			}
			System.out.println();
		}
		sc.close();
	}
	
	static boolean iscomposite(int n) {
		if(n==1) {
			return true;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return true;
			}
		}
		return false;
	}
}
