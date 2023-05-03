package ExceptionHandling;

import java.util.Scanner;
//try with single generic catch
public class Code2 {
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
	catch (Exception e) {
		System.out.println("ArithmeticException Handled");
	}
  }
}
