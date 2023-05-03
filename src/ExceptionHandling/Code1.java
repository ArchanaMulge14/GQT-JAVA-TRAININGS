package ExceptionHandling;
import java.util.Scanner;

public class Code1 {
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator: ");
		int num=sc.nextInt();
		System.out.println("Enter the denominator: ");
		int den=sc.nextInt();
		
		int res=num/den;
		
		System.out.println(res);
	}
	catch (ArithmeticException e) {
		System.out.println("ArithmeticException Handled");
	}
  }
}
