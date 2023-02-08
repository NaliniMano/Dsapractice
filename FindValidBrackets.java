package daily_dsa_prob;

import java.util.HashMap;
import java.util.Stack;

import org.junit.Test;

public class FindValidBrackets {
	
	@Test
	public void example1()
	{
		 String input="({[]})";
		   HashMap<Character,Character> hmap = new HashMap();
		   hmap.put(')', '(');
		   hmap.put(']', '[');
		   hmap.put('}', '{');
		   
		  
		   
		   Stack<Character> stack =new Stack();
		   
		   for(char ch : input.toCharArray())
		    {
			  if(hmap .containsKey(ch))
			    {
				   if(!stack.isEmpty())
				     {
					   if(hmap.get(ch)==stack.peek())
					     stack.pop();
					
					 }
				}else
				{
				   stack.push(ch);
				  
				}
			
			
			}
		   
		  // if(stack.isEmpty()) return
		   if(stack.isEmpty()) System.out.println("Valid");
		   else { System.out.print("not Valid");}

	}

}
