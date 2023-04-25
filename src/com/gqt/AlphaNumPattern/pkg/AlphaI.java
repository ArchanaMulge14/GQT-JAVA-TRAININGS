package com.gqt.AlphaNumPattern.pkg;
import java.util.Scanner;
public class AlphaI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((i==0 && j<n/2) ||(i==n-1 && j<n/2) || j==n/4) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
