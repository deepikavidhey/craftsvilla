package assignment;

import java.util.Scanner;

public class StringFind
{

	public static void main(String[] args) 
	{
		String str="Test/Yantra/Test/Software/Solutions";
		String[] s1=str.split("/");	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the letter");
		String j = sc.nextLine();
		sc.close();
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].startsWith(j))
				System.out.println(s1[i]);
			
		}
	}

}
