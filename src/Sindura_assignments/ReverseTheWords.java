package Sindura_assignments;

public class ReverseTheWords {

	public static void main(String[] args)
	{
	                String str="WELCOME TO TYSS";
	                String[] s1=str.split(" ");
	                
	                System.out.println(str);

	           //     for(int i=0;i<s1.length;i++)
	                {
	                	for(int j=s1[0].length()-1;j>=0;j--)
	                	{
	                		System.out.print(s1[0].charAt(j));
	                	}
	                	System.out.print(" "+str.substring(s1[0].length()));
	                	
	                      
	        }
		
	}
}

/* char[] ch = s1[i].toCharArray();
String s2="";
   for(int j=ch.length-1;j>=0;j--)
   {
           s2=s2+ch[j];
   }
   s1[i]=s2;
}
for(int i=0;i<s1.length;i++)
{
   System.out.print(s1[i]+" ");
}*/