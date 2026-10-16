
class A{
	A(){
		//this.display();
		System.out.println("Parent constructor called !!!");
	}
}
class B extends A{
	B(){
		//this.display();
		this(10);
		System.out.println("Child constructor called !!!");
	}
	B(int x){
		super();
		System.out.println(x);
	}
}
public class ThisSuperEx {

	void display() {
		System.out.println("hello");
	}
	ThisSuperEx(){
		this.display();
	}
	public static void main(String[] args) {
		ThisSuperEx t=new ThisSuperEx();
		t.display();
	}

}
