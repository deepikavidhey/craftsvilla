package assignment;

import java.util.Scanner;

public class HexaToDec {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a Hexadecimal number");
		String str=sc.nextLine();
		sc.close();
		
		String digits="0123456789ABCDEF";
		String s=str.toUpperCase();
		int val=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int d=digits.indexOf(ch);
			val=val*16+d;
		}
System.out.println(val);
	}

}
