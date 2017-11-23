package assignment;

public class FindMissing {

	public static void main(String[] args) 
	{
		int[] a={10,15,20,30,35};
		for(int i=0;i<a.length-1;i++)
		{
				
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.print(j+" ");
				
			}							
			System.out.println(" ");
		}
				
	}

}
