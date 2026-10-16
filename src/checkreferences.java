
public class checkreferences {

	public static void main(String[] args) {
		int a=128;
		int b=128;
		System.out.println(a==b);
		String s=new String("java");
		String s1=new String("java");
		System.out.println(s1);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}

}

