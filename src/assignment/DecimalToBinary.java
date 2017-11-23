package assignment;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a decimal number");
		int decimal=sc.nextInt();
		sc.close();
		System.out.println("Decimal : "+decimal);
		
		int mul=1,binary=0;
		while(decimal>0)
		{
			int rem=decimal%2;
			binary=binary+rem*mul;
			mul*=10;
			decimal/=2;
		}
		System.out.println("Binary  : "+binary);
		
	}
}
