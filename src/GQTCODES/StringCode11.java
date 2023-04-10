package GQTCODES;
//WAP to count total number of words in the given string
//input: "Hi Hello Hey"
//output: 3
//According to general English terms:
//number of words = total number of spaces in the string + 1;
import java.util.Scanner;

public class StringCode11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();//used to collect sentences
		int spc_cnt=0;
		str=str.trim();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
		        spc_cnt++;
			}
		}
		int word_cnt=spc_cnt+1;
		System.out.println("Word count="+ word_cnt);
	}

}
