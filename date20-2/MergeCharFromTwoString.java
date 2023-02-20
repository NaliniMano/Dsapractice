package daily_dsa_prob;

import org.junit.Test;

public class MergeCharFromTwoString {
	
	@Test
	public void example1()
	{
		String word1 = "ab", word2 = "pqrs";
	
		removePalindromeSub(word1,word2);
	}
	
	@Test
	public void example2()
	{
		String word1 = "abcd", word2 = "pq";
	
		removePalindromeSub(word1,word2);
	}

	private void removePalindromeSub(String word1, String word2) {
		// TODO Auto-generated method stub
		 int left=0,right=0;
	        StringBuffer sb =new StringBuffer();
	        while(left < word1.length() || right < word2.length())
	        {
	            if(left < word1.length())
	                sb.append(word1.charAt(left));
	            if(right < word2.length())
	                sb.append(word2.charAt(right));
	            left++;
	            right++;
	                
	        }

System.out.println(sb.toString());	
	}

}
