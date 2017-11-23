
public class Patterntriangle {

	public static void main(String[] args)
	{
		for(int i=1;i<=7;i++)	
			
		{if(i<5){
			for(int j=1;j<=4;j++)
			{
				if(i==j)
					System.out.print("*");
				else if(i<j)
					System.out.print("**");
				else
					System.out.print(" ");
			}
		}
		else
			for(int j=1;j<=4;j++)
			{
				if(i+j==8)
					System.out.print("*");
				else if(i+j>8)
					System.out.print("**");
				else
					System.out.print(" ");
			}System.out.println();
		}
	}

}
