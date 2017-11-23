package assignment;

import java.util.Scanner;

public class PatternSquare {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || i==j || i+j==n+1 || j==n || i==1 || i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}System.out.println();
		}

	}

}
