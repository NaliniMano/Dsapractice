package daily_dsa_prob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindDistinctSubstring_GivenString {
	
	
	public void example1()
	{
		String s="aababcabc";
		findDistinctSubString(s);
		findDistinctSubString_SlidingWindow(s);
	}

	private int findDistinctSubString_SlidingWindow(String s) {
		// TODO Auto-generated method stub
	     if(s.length()<3) return -1;
         int count=0,start=0;
         HashMap<Character,Integer> hmap =new HashMap();
         for(int i=0;i<3;i++)
         {
             hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i),0)+1);
         }
       
       if(hmap.size()==3) count++;
       
       for(int i=3;i<s.length();i++)
       {
            hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i),0)+1);
           if(hmap.get(s.charAt(start))>1) hmap.put(s.charAt(start),hmap.get(s.charAt(start))-1);
           else hmap.remove(s.charAt(start));
           start++;
            if(hmap.size()==3) count++;
       }
       System.out.println(count);
       return count;
	}

	private void findDistinctSubString(String s) {
		// TODO Auto-generated method stub
		List<String> li =new ArrayList();
        HashSet<Character> hs =new HashSet();
        boolean isDistinct=false;
       for(int i=0;i<s.length()-2;i++)
       {
           String tem=s.substring(i,i+3);
           
           for(char c: tem.toCharArray())
           {
               if(hs.contains(c))
               {
                  isDistinct=true;
               }else
               {
                   hs.add(c);
               }
               
           }
           if(!isDistinct) li.add(tem);
           hs.clear();
           isDistinct=false;
       }
        
     System.out.println(li.size());   
	}

}
