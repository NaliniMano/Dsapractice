package daily_dsa_prob;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestNiceSubstring {
	
	/**yazaAay  -> aAa
	 * abaAB  ->abaAB
	 * abcd -> ""
	 * aA->aA
	 * 
	 * 
	 * 
	 */
	@Test
	public void example1()
	{
		String s="abaAB";
		System.out.println(findLongestNiceString(s));
		
	}

	private String findLongestNiceString(String s) {
		// TODO Auto-generated method stub
		   if (s.length() < 2) return "";
	        char[] chars = s.toCharArray();
	        Set<Character> set = new HashSet<Character>();
	        for (char c: chars)
	            set.add(c);
	        for (int i = 0; i < chars.length; i++) {
	            if (set.contains(Character.toUpperCase(chars[i])) && set.contains(Character.toLowerCase(chars[i]))) continue;
	            String sub1 = findLongestNiceString(s.substring(0, i));
	            String sub2 = findLongestNiceString(s.substring(i+1));
	            return sub1.length() >= sub2.length() ? sub1 : sub2;
	    
	}
			return s;

}
	}
