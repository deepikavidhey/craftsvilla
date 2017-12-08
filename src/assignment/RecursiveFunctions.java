package assignment;

public class RecursiveFunctions 
{
	public static int fact(int n)
	{
		if(n==1)
		return 1;
		else
		return n*fact(n-1);
	}
	
public static int fib(int n)
{
	if(n==0)
		return 0;
	else if(n==1 || n==2)
		return 1;
	else
	return (fib(n-1)+fib(n-2));
}
	
	public static void num(int i)
	{
		if(i<=100)
		{
		System.out.println(i);
		i++;
		num(i);
		}
		
	}
	
	public static void main(String[] args)
	{
		
			System.out.println(fib(7));

		System.out.println(fact(5));
	//	num(1);
		
		String str="hello";
	
		String str3=new String("hello");
		
		//int i = str.length()-1;
		if(str.equals(str3))
		System.out.println(true);
		else
			System.out.println("no");
		
		
		char[] ch={'h','i','r'};
		
		String s=new String(ch);
		System.out.println(s);
	}

}
