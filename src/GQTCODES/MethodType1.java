package GQTCODES;

class Calculator1{
	void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
}
public class MethodType1 {
	public static void main(String[] args) {
		Calculator1 c1=new Calculator1();
		c1.add();
	}
}
