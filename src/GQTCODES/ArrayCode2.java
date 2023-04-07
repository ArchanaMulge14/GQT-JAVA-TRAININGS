package GQTCODES;

import java.util.Scanner;
/*
 * (i)         (j)
 * class       students
 * 0             5
 * 1             5
 * 2             5
 */

public class ArrayCode2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of classes:");
		int cls=sc.nextInt();
		System.out.println("Enter the count of students:");
		int stu=sc.nextInt();
		
		int arr[][]=new int[cls][stu];
		
		for(int i=0;i<cls;i++) {
			System.out.println("Inside classes:"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter marks of student no:"+(j+1));
				arr[i][j]=sc.nextInt();
		}
	}
		for(int i=0;i<cls;i++) {
			System.out.println("Inside classes:"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("The marks of student no:"+(j+1)+"is:"+arr[i][j]);
			
		}
	}
  }
}
