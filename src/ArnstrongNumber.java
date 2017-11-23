import java.util.Scanner;

public class ArnstrongNumber
{

	public static void main(String[] args)
	{
		
				    int c=0,rem,temp;
				    /*Scanner sc=new Scanner(System.in);
				    System.out.println("Please enter a number");
				    int n=sc.nextInt();*/
				    int n=351;
				    temp=n;			    
			
				    while(n>0)  
				    {  
				    rem=n%10;  
				    n=n/10;  
				  //  System.out.println(rem);
				    c=c+(int)Math.pow(rem, 3);
				    }  
				    
				    if(temp==c)  
				    System.out.println("armstrong number"+c);   
				    else  
				        System.out.println("Not armstrong number");   
				   }  
				  

	}


