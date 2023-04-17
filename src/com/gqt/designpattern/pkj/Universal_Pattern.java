package com.gqt.designpattern.pkj;
import java.util.Scanner;
public class Universal_Pattern {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i==0 || i==n-1 || j==0 || j==n-1//outer border
				|| i==j || i+j==n-1//diagonals
				|| i==n/2 || j==n/2
				|| i+j==(n-1)/2
				|| i-j==(n-1)/2
				|| j-i==(n-1)/2
				|| i+j==(n-1)/2*3){
					System.out.print("* ");		
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
