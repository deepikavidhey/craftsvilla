package assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RepeatedChar {
static char ch1;
	public static void main(String[] args) {
		String str="deepiidkiaa";
		Set<String> s = new LinkedHashSet<String>();
		/*for(int i=0;i<str.length();i++)
			s.add(str.charAt(i));*/
		
		char[] ch=str.toCharArray();
			
		for(int i=0;i<ch.length-1;i++)
		{	int count=1;	
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
				count++;
				
				//break;
				}	
				
				
			}
			if(count>1){
				System.out.println(ch[i]+" is repeated for "+count +" times");	
		
				}
					else
				System.out.println(ch[i]+" is present "+count +" time");
			
		
		}
		

	}

}
