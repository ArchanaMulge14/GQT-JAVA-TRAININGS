package com.gqt.designpattern.pkj;

import java.util.Scanner;

public class Dp6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the value:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int k=1;k<=n;k++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}	
    }
}
