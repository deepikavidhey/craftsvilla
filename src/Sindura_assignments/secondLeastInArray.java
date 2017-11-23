package Sindura_assignments;

import java.util.Scanner;

public class secondLeastInArray {

	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of array elements");
		int n=sc.nextInt();		
		int[] arr=new int[n];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{		 
			arr[i]=sc.nextInt();
		}
		sc.close();
		
	//------------------------------*********************-----------------------------------//
	
		 for (int i = 0; i < arr.length; i++)
		 {
		     for (int j = i + 1; j < arr.length; j++) 
		     {
		            int tmp = 0;
		            if (arr[i] > arr[j])
		            {
		                tmp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = tmp;
		            }
		     }
		 }
		for(int i=0;i<n;i++)
		{		 
			System.out.print(arr[i]+" ");
		}System.out.println();
			
		System.out.println("The Second Least number is "+ arr[1]);
	}

}
