package Sindura_assignments;

public class Palindrome {

	public static void main(String[] args) 
	{
	String str="MADAM";
	String s="";	
	for(int i=str.length()-1;i>=0;i--)
	{
				s+=str.charAt(i);
	}
	if(s.equals(str))
		System.out.println("Yes Palindrome");
	else
		System.out.println("Not a palindrome");
	}

}
