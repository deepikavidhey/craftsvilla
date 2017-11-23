package Sindura_assignments;

import java.util.HashSet;

public class ReverseASentenceWithSpecialChars
{
	      public static void main(String args[])
	        {
	                HashSet<Character> set = new HashSet<Character>();
	                set.add(' ');
	                set.add('@');
	                set.add('#');
	                
	                String str="WE@LCOME TO# TYSS";
	                char[] ch = str.toCharArray();
	                System.out.println(ch);
	                
	                int l = 0;	                
	                int r = ch.length - 1;
	                
	                for (int i = 0; i < ch.length; i++)
	                {

	                        if (l>=r)
	                        {
	                                break;
	                        }
	                        if (!set.contains(ch[l]) && !set.contains(ch[r]))
	                        {
	                                char temp = ch[l];
	                                ch[l] = ch[r];
	                                ch[r] = temp;

	                                l++;
	                                r--;
	                        }
	                        else if (set.contains(ch[l]))
	                                l++;
	                    else if (set.contains(ch[r]))
	                                r--;
	                }
	                
	                System.out.println(ch);
	    	  
	    	  
	
	        }
}

