
public class ArraylistDemo
{

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
		for(int j=1;j<=10;j++)
		{
			if(i<=5)
			{
			if(i+j>=11)
				System.out.print(" "+"*");
			else
				System.out.print(" ");
			}
			else 
			{
			if(i<j)
				System.out.print(" "+"*");
			else
				System.out.print(" ");
			}
		}System.out.println();
	}/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i<j)
					System.out.print(" "+"*");
				else
					System.out.print(" ");
			}System.out.println();
			
		}*/
		
	}

}
