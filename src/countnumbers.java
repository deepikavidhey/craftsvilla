
public class countnumbers 
{

	public static void main(String[] args) 
	{
		String str="ANUSHA.CV001@TEST#YANTRA.COM";
		char[] ch=str.toCharArray();
		System.out.println(ch);
	int count=0;
		for(int i=ch.length-1;i>=0;i--)
		{
			/*//if(ch[i]>=48 && ch[i]<=57)// || ch[i]>=65 || ch[i]<=90 || ch[i]>=97 || ch[i]<=122)
			if(ch[i]<48 ||( ch[i]>57 && ch[i]<65) || (ch[i]>90 && ch[i]<97) || ch[i]>122)	
			count++;
			
			else*/
				System.out.print(ch[i]);
			
				
		}
		System.out.println("\nthe number of digits in a strings are"+count);
	}

}
