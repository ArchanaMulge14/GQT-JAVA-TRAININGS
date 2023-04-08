package GQTCODES;

class Calculator2{
	void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
}

public class MethodType2 {
	public static void main(String[] args) {
		Calculator2 c2=new Calculator2();
		c2.add(20,30);
	}
}
