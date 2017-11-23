package assignment;

import java.util.Scanner;

public class PatternR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int n=sc.nextInt();
		sc.close();
			
		for(int i=1;i<=n;i++)
		{
				
				for(int j=1;j<=n;j++)
				{
					if((j==n && i==1)|| (i==n/2+1 && j==n))
					{
						System.out.print(" ");
					}
					else if(i==1|| j==1 || i==n/2+1 || j==n )
					{
						System.out.print("*");
					}
										
					else 
					{
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}


	}
}


