package com.gqt.designpattern.pkj;

import java.util.Scanner;

public class Dp8 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the value:");
		int n = sc.nextInt();
		for(int i=n;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("& "+" ");
			}
			for(int j=0;j<4;j++)
			{
				System.out.print("# "+" ");
			}
		    for(int j=n;j>=i;j--)
		    {
			    System.out.print("@ "+" ");
		    }
		System.out.println();
	  }	
    }
}

