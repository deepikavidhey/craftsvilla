
public class PalindromeString {

	public static void main(String[] args) {
		
	String str="MALAYALAM";
	String s="";
	for(int i=str.length()-1;i>=0;i--)
	{
		s+=str.charAt(i);
	}
	if(s.equals(str))
	System.out.println(str+" : is Palindrome");
	else
		System.out.println(str+" : Not a palindrome");
	
	
	
	
	int i=12321;
	int c=0;
	int mul=10;
	int k=i;
	while(i>0)
	{
		int rem=i%10;
		i=i/10;
		c=mul*c+rem;
		
		
	}
	if(k==c)
		System.out.println(k+" : is Palindrome");
		else
			System.out.println(k+" : Not a palindrome");
	
	
	
	
	}
	
	
	
	

}
