package Sindura_assignments;

import java.util.Arrays;

public class ThirdMaximum {

	public static void main(String[] args) 
	{
		int[] arr={9,8,3,6,4,5,7,1,2};
		
				 for (int i = 0; i < arr.length; i++)
				 {
				     for (int j = i+1; j < arr.length; j++) 
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
				 
				 
				for(int i=0;i< arr.length;i++)
				{		 
					System.out.print(arr[i]+" ");
				}
			System.out.println();
				System.out.println("The Third Maximum number is "+ (arr.length-3));
			}

		

	}


