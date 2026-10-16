import java.util.Scanner;

public class IfCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 st sub marks of the student");
		int m1=sc.nextInt();
		System.out.println("Enter 2 nd marks of the student");
		int m2=sc.nextInt();
		System.out.println("Enter 3 rd marks of the student");
		int m3=sc.nextInt();
		System.out.println("Enter 4 th marks of the student");
		int m4=sc.nextInt();
		System.out.println("Enter 5 th marks of the student");
		int m5=sc.nextInt();
		for(int i=1;i<=5;i++) {
			
		}
		int sum=(m1+m2+m3+m4+m5);
		double marks=((sum/500)*100);
		System.out.println(sum);
		System.out.println(marks);
		
		
		if(marks>=90 && marks<=100) {
			System.out.println("Grade A");
		}
		else if(marks>=75) {
			System.out.println("Grade B");
		}
		else if(marks>=60) {
			System.out.println("Grade C");
		}
		else if(marks>=40) {
			System.out.println("Grade D");
		}
		else if(marks<40) {
			System.out.println("Fail");
		}
		sc.close();
	}
}





/*A: ≥90
B: ≥75
C: ≥60
D: ≥40
F: <40*/