package assignment;

public class Pattern1_9 {

	public static void main(String[] args) 
	{

		int k=1;
			for(int i=1;i<=6;i++)
			{
				for(int j=1;j<=i;j++)
				{
					
						System.out.print(k++);
						if(k==10)
							k=1;
					
				}
				System.out.println();
			}
	}

}
