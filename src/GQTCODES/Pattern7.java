package GQTCODES;
import java.util.Scanner;
public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			count=i;
			for(int j=1;j<=n;j++) {
				System.out.print(count+"  ");
				count=count+n;
			}
			System.out.println();
		}
	}
}
