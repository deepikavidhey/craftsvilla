package Sindura_assignments;

public class MissingNumberInArray 
{
	public static void main(String[] args)
	{
	int a[]={1,2,3,4,5,7,8,9,10};
	int sum=0,allsum=0;
	
	for(int j=1;j<=10;j++)
			allsum+=j;
		
	for(int j=0;j<a.length;j++)
		sum+=a[j];

	System.out.println(allsum-sum);
	}

}
