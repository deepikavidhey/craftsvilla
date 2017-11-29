


public class MainClass 
{

	public static void main(String args[])
	{
		
		A a2=new A();
		a2.method1();
		
		//upcasting
		A a1=new B();
		a1.method1();
		
		//downcasting
		B b1=(B)a1;
		b1.method1();		
	
		//upcasting
		A a3=b1;
		a3.method1();
	}
}

class A
{
	public void method1()
	{
		System.out.println("Class A Method ");
	}
	
}
class B extends A
{
	public void method1()
	{
		System.out.println("Class B Method ");
	}
}