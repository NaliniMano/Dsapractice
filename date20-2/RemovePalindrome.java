package daily_dsa_prob;

import org.junit.Test;

public class RemovePalindrome {
	
	@Test
	public void example1()
	{
		String s = "ababa";
		removePalindromeSub(s);
	}

	private int removePalindromeSub(String s) {
		// TODO Auto-generated method stub
		   int left=0,right=s.length()-1;
	        while(left <= right)
	        {
	             if(s.charAt(left)!= s.charAt(right))
	                 return 2;
	            left++;
	            right--;
	        }
	     return 1;   
	}

}
