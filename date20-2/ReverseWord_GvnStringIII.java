package daily_dsa_prob;

import org.junit.Test;

public class ReverseWord_GvnStringIII {
	
	@Test
	public void example1()
	{
		String s = "Let's take LeetCode contest";
		reverseWords(s);
	}
	
	@Test
	public void example2()
	{
		String s = "God Ding";
		reverseWords(s);
	}

	 public String reverseWords(String s) {
	     String[] input_str = s.split(" ");
	       StringBuffer sb =new StringBuffer();
	        String output="";
	        for(String st : input_str)
	        {
	            sb.append(st);
	            sb.reverse();
	        
	            output+=sb.toString()+" ";
	                sb.delete(0, sb.length());

	        }
	        System.out.println(output.trim());
	        return output.trim();
	    }
}
