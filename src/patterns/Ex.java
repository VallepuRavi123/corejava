package patterns;

public class Ex {

	public static void main(String[] args) {
		int n=3;
		outer:
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
				continue outer;
				}
				System.out.print (i+""+j+" ");
				
			}
			
		}

	}
}
