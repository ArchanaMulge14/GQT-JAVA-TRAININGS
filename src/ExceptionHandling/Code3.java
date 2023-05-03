package ExceptionHandling;

import java.util.Scanner;
//try with multiple catch
//If incase we are using try with multiple catch then we must use specific catch first and then generic
public class Code3 {
	public static void main(String[] args) {
		try {
			System.out.println("Division ops started");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numerator: ");
			int num=sc.nextInt();
			System.out.println("Enter the denominator: ");
			int den=sc.nextInt();
			
			int res=num/den;
			
			System.out.println(res);
			System.out.println("Division ops completed");
			
			System.out.println("Array ops");
			System.out.println("Enter array size: ");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Array ops completed");
					
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException Handled");
		}
		catch (NegativeArraySizeException e1) {
			System.out.println("NegativeArraySizeException Handled");
		}
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
	 }
}
