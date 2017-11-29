package Sindura_assignments;

public class StringSplit 
{

	public static void main(String[] args) 
	{
		/*double d=10.583;
		int i=(int)d;
		String s=Integer.toString(i);
		int j=Integer.parseInt(s);
		double d1=j;
		System.out.println(d1);
		*/
	/*	int[] arr={10,20,30,40,10,20}; 
		
		for(int i1=0;i1<arr.length;i1++)
		{
			int count=1;
			for(int j1=i1+1;j1<arr.length;j1++)
			{
			
			if(arr[i1]==arr[j1])
			{
				arr[j1]=0;
				count++;
			}
			
			
			}
			if(arr[i1]!=0)
			{
				if(count==1)
				System.out.println(arr[i1]);
				
			}
		}*/
		
		int[] arr={10,20,30,40,10,20}; 
		
		for(int i1=0;i1<arr.length;i1++)
		{
			int count=1;
			for(int j1=i1+1;j1<arr.length;j1++)
			{
			
			if(arr[i1]<arr[j1])
			{
				int temp=arr[i1];
				arr[i1]=arr[j1];
				arr[j1]=temp;
				
			}System.out.println(arr[i1]);
			}
		}
		
	}

}
