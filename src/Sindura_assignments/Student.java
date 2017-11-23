package Sindura_assignments;

import java.util.Scanner;

public class Student 
{ 
  public static void main(String[] args) 
  {

          String[] name = new String[20] ;
          int[] id = new int[5];
          int[] age = new int[5];
          int tmp;

          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number of students");
          int n=sc.nextInt();
          sc.nextLine();
          
          for(int i=0;i<n;i++)
          {
        	 
          System.out.println("Enter Student's Name");
          name[i]=sc.nextLine();
              
        
          }
        
          for(int i=0;i<n;i++)
          {
          System.out.println("Enter Student's id");
          id[i]=sc.nextInt();
          }

          for(int i=0;i<n;i++)
          {
          System.out.println("Enter Student's Age");
          age[i]=sc.nextInt();
          }
          sc.close();
         
          System.out.println("***************STUDENT  DETAILS***********************");
          for(int i=0;i<n;i++)
          {
        	  System.out.println("Student's Name: "+name[i]+" id: "+id[i]+" Age: "+age[i]);

          }

			 for (int i = 0; i < n; i++)
			 {
			     for (int j = i + 1; j < n; j++) 
			     {
			           tmp = 0;
			            if (id[i] > id[j])
			            {
			                tmp = id[i];
			                id[i] = id[j];
			                id[j] = tmp;
			            }
			     }
			 }

          
			 System.out.println("******SORTED*********STUDENT  DETAILS*************BY ID**********");
		     for(int i=0;i<n;i++)
	         {
	             
		    	 System.out.println("Student's Name: "+ name[i] +" id: "+ id[i] +" Age: "+ age[i]);

	         }
	     
  }
}
