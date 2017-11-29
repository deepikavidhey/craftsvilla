
public class Pattern1 {

	public static void main(String[] args) 
	{
		int m=4,n=4;
		
		/*for(int i=1;i<=m;i++)
		{			
			for(int j=1;j<=n;j++)
			{
			if(i+j==5)
				System.out.print("*");
			else if(i+j>5)
				System.out.print("**");
			else
				System.out.print(" ");
			}
			System.out.println();
			
		} //int l=10;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<j)
				System.out.print("*"+" ");
				else
					System.out.print(" ");
			}

			System.out.println();
			
		}*/

		
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1)
					System.out.print("*"+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
			
	}

}
