
public class countnumbers 
{

	public static void main(String[] args) 
	{
		String str="ANUSHACV001";
		char[] ch=str.toCharArray();
		System.out.println(ch);
	int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>=48 && ch[i]<=57)
				count++;
			else
				System.out.print(ch[i]);
				
		}
		System.out.println("\nthe number of digits in a strings are "+count);
	}

}
