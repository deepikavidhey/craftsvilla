package assignment;

public class Deepika 
{

	public static void main(String[] args)
	{
		String str="Deepika";
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(i>=j)
					System.out.print(ch[j]);
				else
					System.out.print(" ");
			}System.out.println();
		}
	}

}
