package daily_dsa_prob;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FindPalindromicSubstring {
	
	
	@Test
	public void example1()
	{
		/**
		 * Testdata :
		 * 
		 *  data1 = aBBBcdMOMkajleDAD -BBB MOM DAD
		 *  data2 = ccaBBBkkAAA --> return AAA, BBB
		 *  data3 = yrterk  -> empty list
		 * 
		 * pseudocode
		 * 1. iterate through the string
		 * 2. find the substring (0,3);
		 * 3. chek the substring is palindrome
		 *    add to list
		 *   repeat the step 2,3 and return the list
		 *   
		 *    
		 * 
		 * 
		 * 
		 */
		String input="yrterk";
		
		List<String> li = new ArrayList();
		
		for(int i=0;i<input.length()-2;i++)
		{
			String temp =input.substring(i,i+3);
			System.out.println(temp);
			if(isPalindrome(temp))
			{
				li.add(temp);
			}
		
		}
		
		System.out.println(li);
		
		
	}
	
	public boolean isPalindrome(String s)
	{
		int left=0,right=s.length()-1;
		while(left < right)
		{
			if(s.charAt(left)!=s.charAt(right))
				return false;
			left++;
			right--;
		}
		
		return true;
	}
	}


