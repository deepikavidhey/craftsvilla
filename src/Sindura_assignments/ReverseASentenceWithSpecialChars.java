package Sindura_assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ReverseASentenceWithSpecialChars
{
	      public static void main(String args[])
	        {
	                HashSet<String> hset = new HashSet<String>();
	                hset.add("Hi");
	                hset.add(null);
	                hset.add(" ");
	                hset.add("Bi");
	                hset.add(null);
	                hset.add("Ai");
	                System.out.println(hset);
	                
	                TreeSet<String> tset = new TreeSet<String>();
	                tset.add("Hi");
	            //    tset.add(null);
	                tset.add(" ");
	                tset.add("Bi");
	           //     tset.add(null);
	                tset.add("Ai");
	                System.out.println(tset);
	                
	                
	                LinkedHashSet<Character> lhset = new LinkedHashSet<Character>();
	                lhset.add('5');
	                lhset.add(' ');
	                lhset.add(null);
	                lhset.add('1');
	                lhset.add('1');
	                lhset.add(null);
	                lhset.add('2');
	                System.out.println(lhset);
	                
	                if(tset.size()==lhset.size())
	                	System.out.println(true);
	                else
	                	System.out.println(false);
	                
	    	  
	    	  
	               /* String str="WE@LCOME TO# TYSS";
	                char[] ch = str.toCharArray();
	                System.out.println(ch);
	                
	                HashSet<String> hset = new HashSet<String>();
	                hset.add(" ");
	                hset.add("@");
	                hset.add("#");
	                int l = 0;	                
	                int r = ch.length - 1;*/

	                //if(Character.isAlphabetic(ch(l)))
	                
	              /*  for (int i = 0; i < ch.length; i++)
	                {

	                        if (l>=r)
	                        {
	                                break;
	                        }
	                        if (!hset.contains(ch[l]) && !hset.contains(ch[r]))
	                        {
	                                char temp = ch[l];
	                                ch[l] = ch[r];
	                                ch[r] = temp;

	                                l++;
	                                r--;
	                        }
	                        else if (hset.contains(ch[l]))
	                                l++;
	                    else if (hset.contains(ch[r]))
	                                r--;
	                }
	                
	                System.out.println(ch);
	    	  
	    	  */
	
	        }
}

