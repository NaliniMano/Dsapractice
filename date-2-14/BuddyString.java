package daily_dsa_prob;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class BuddyString {
	
	@Test
	public void example1()
	{
		String s="ab";
		String t="ac";
		isBuddyString(s,t);
	}

	
	@Test
	public void example2()
	{
		String s="aa";
		String t="aa";
		isBuddyString(s,t);
	}
	
	@Test
	public void example3()
	{
		String s="aab";
		String t="aac";
		isBuddyString(s,t);
	}
	
	private boolean isBuddyString(String s, String t) {
		// TODO Auto-generated method stub
		
		if(s.length()!=t.length()) return false;
        Set<Character> hs=new HashSet();
        List<Integer> li =new ArrayList();
        if(s.equals(t))
        {
            for(int i=0;i<s.length();i++)
            {
                if(hs.contains(s.charAt(i)))
                {
                    return true;
                }else{
                    hs.add(s.charAt(i));
                }
            }
        }   
            
            else {
            	
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)!=t.charAt(i))
                {
                    li.add(i);
                }
            }
            }
            System.out.println(li);
              return li.size() == 2 && s.charAt(li.get(0)) == t.charAt(li.get(1)) && s.charAt(li.get(0)) == t.charAt(li.get(1));
            
		
		
		
	
		
		
	}

}
