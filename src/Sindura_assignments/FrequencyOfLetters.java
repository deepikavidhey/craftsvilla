package Sindura_assignments;

public class FrequencyOfLetters
{

	public static void main(String[] args)
	{
		
		String s1="dddeeepikaiiikkkd";
	    char[] ch=s1.toCharArray();
	    for(int i=0;i<ch.length;i++)
	    {
	           int skipSameLetter=1;
	            int Count=1;
	            for(int k=0;k<i;k++)
	            {
	                    if(ch[i]==ch[k])
	                    {
	                            skipSameLetter++;
	                    }
	            }
	            if(skipSameLetter==1)
	            {
	                    for(int j=i+1;j<ch.length;j++)
	                    {
	                            if(ch[i]==ch[j])
	                            {
	                                    Count++;
	                            }
	                    }
	                    if(Count>1)
	                    System.out.println(ch[i]+" is present for "+Count+" times");
	                    else
	                    System.out.println(ch[i]+" is present for "+Count+" time");
	            }
	    
	}

	}

}
