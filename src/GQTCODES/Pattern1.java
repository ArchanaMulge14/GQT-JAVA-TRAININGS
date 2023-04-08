package GQTCODES;
import java.util.Scanner;
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int count=n*n;
		for (int i=1; i<=n; i++) {
		System.out.print(count+" ");
			count=count-n;
		}
	}

}
