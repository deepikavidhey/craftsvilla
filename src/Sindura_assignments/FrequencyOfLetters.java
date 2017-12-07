package Sindura_assignments;

public class FrequencyOfLetters
{

	public static void main(String[] args)
	{
		
		String s1="dddeeepikaiiikkkd";
	    char[] ch=s1.toCharArray();
	    for(int i=0;i<ch.length;i++)
	    {
	          int Count=1;
	                    for(int j=i+1;j<ch.length;j++)
	                    {
	                            if(ch[i]==ch[j])
	                            {
	                            	ch[j]='*';
	                                    Count++;
	                            }
	                    }
	                    if(ch[i]!='*')
	                    System.out.println(ch[i]+" is present for "+Count+" times");
	                   /* else
	                    System.out.println(ch[i]+" is present for "+Count+" time");*/
	            }
	    
	}

	}

