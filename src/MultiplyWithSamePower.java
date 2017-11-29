
public class MultiplyWithSamePower {

	public static void main(String[] args) 
	{

	    int rem,sum;
	    int n=145;
	    	sum=0;		    

	    while(n>0)  
	    {  
	    rem=n%10;  
	    n=n/10; 
	    int c=1;
	    for(int i=1;i<=rem;i++)
	    c=c*rem;
	    sum=sum+c;
	   
	    }  
	    
	    
	        System.out.println("the answer : "+sum);   
	   }  
	  




	}


