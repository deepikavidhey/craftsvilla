package Sindura_assignments;

public class FrequencyOfWords 
{
	static int count;
	public static void main(String[] args)
	{
	String str="Life is Life is Beautiful file is Life is Music file";
	
	String[] s=str.split(" ");
	
	for(int i=0;i<s.length;i++)
	{	
	
			int count=1;
		
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				
				{
				s[j]=" ";
				count++;
							
				}		        
			} 
		
			if(s[i]!=" ")
            System.out.println(s[i]+" : is present for "+count+" times");
		
      
		
	}
	
	}
}


	
