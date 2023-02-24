package daily_dsa_prob;

import java.util.HashMap;

import org.junit.Test;

public class Permutation_in_String {

	/**
	 * https://leetcode.com/problems/permutation-in-string/submissions/
	 */
	@Test
	public void example1()
	{
		String s1="ab";
		String s2="eidbaooo";
		findPermtation(s1,s2);
		
	}
	
	@Test
	public void example2()
	{
		String s1="ab";
		String s2="eidboaoo";
		findPermtation(s1,s2);
		
	}
	@Test
	public void example3()
	{
		String s1="ab";
		String s2="a";
		findPermtation(s1,s2);
		
	}
	private boolean findPermtation(String k ,String s) {
		// TODO Auto-generated method stub
		  if(s.length() < k.length()) return false;
		     
	         HashMap<Character,Integer> hmap =new HashMap();
	         HashMap<Character,Integer> kmap =new HashMap();
	        int start=0;
	        
	        	for(int i=0;i<k.length();i++)
			{
				kmap.put(k.charAt(i),kmap.getOrDefault(k.charAt(i), 0)+1);
			}
			
			for(int i=0;i<k.length();i++)
			{
				hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0)+1);
			}
	        
	        
	        
	        if(hmap.equals(kmap)) return true;
	        
	        for(int j=k.length();j<s.length();j++)
	        {
	            hmap.put(s.charAt(j), hmap.getOrDefault(s.charAt(j), 0)+1);
	            
	            	if(hmap.get(s.charAt(start))>1)
	                hmap.put(s.charAt(start), hmap.get(s.charAt(start))-1);
				else
				  hmap.remove(s.charAt(start));
				
					if(hmap.equals(kmap))
					{
						return true;
					}
			
				start++;
	        }
	        return false;
	}
}
