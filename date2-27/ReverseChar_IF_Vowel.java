package com.test.sel_learn.windows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class ReverseChar_IF_Vowel {
	
	@Test
	public void example1()
	{
		String s="Hello";
		doReverseString(s);
	}

	private void doReverseString(String s) {
		// TODO Auto-generated method stub
	//	HashSet<Character> hs =new HashSet();
	//	List<Character> li =new ArrayList();
        Set<Character> hs = Set.of('a','e','i','o','u','A','E','I','O','U');

		
 
			char[] c =s.toCharArray();
			int left=0,right=s.length()-1;
			while(left <=right )
			 {
			   if(hs.contains(c[left]) && hs.contains(c[right]))
			   {
			     char temp =c[left];
				 c[left]=c[right];
				 c[right]=temp;

				   left++;
				   right--;
			   }
			   else if(!hs.contains(c[left])) left++;
			   else right--;
			 }
	System.out.println(Arrays.toString(c));
	
	System.out.println(String.valueOf(c));
	}

}
