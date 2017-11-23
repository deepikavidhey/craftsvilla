
public class ReplaceAChar {

	public static void main(String[] args)
	{
		String str="Deepaka";
		String newstr ="";
		int j=str.indexOf('a');
	
		int k=str.indexOf('a', j+1);
		
		
		
		for (int i = 0; i < str.length(); i++)
		 {
			 if(i==k) 
		  //if( str.charAt(i) == 'a')
		    {
		    	newstr+="";
		    	
		    }
		    else
		    {
		    	newstr+=str.charAt(i);
		  	}
		   
		  }
		System.out.println(newstr);//return output;
	
		
	}
}
	


