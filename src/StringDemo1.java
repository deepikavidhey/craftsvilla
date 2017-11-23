import java.util.ArrayList;

/*class A
{
	void m1()
	{
		System.out.println("Hi");
	}
}
class B extends A
{
	void m1()
	{
	
	System.out.println("Bye");
	}
}*/
/*A a1=new B();
		a1.m1();
		B b2=(B)a1;
		b2.m1();
		*/
public class StringDemo1 {

	
	public static void main(String[] args)
	{
			
		ArrayList<String> list=new ArrayList<>(); 
		
		
			String str="Rs. 10000";
			String[] s=str.split(" ");
			for(int i=0;i<s.length-1;i++)
			{
				System.out.println(s[1]);
			list.add(s[1]);
			list.add("51000");
			list.add("1000");
			}
			System.out.println(list.size());
			
			for (int i = 0; i < list.size()-1; i++) 
			{
				
					String k=list.get(i);
					String l=list.get(i+1);
					int a=Integer.parseInt(k);
					int b=Integer.parseInt(l);
					if(a<b)
					{
						System.out.println("pass");
						
					}
					else
					{
						System.out.println("fail");
						
					}
					continue;
				
			}
		}
		
		
	}
	
	

