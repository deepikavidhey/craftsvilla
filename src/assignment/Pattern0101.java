package assignment;



public class Pattern0101 {

	public static void main(String[] args) 
	{
		int l=0,k=1;
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if(i>=j)
					{
						System.out.print(l);
						l=k+l;
						k=l-k;
						l=l-k;
					}
					else
					{
						System.out.print(" ");
					}
				}System.out.println();
			}
	}

}
