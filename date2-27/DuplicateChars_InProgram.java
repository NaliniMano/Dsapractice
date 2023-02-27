package com.test.sel_learn.windows;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class DuplicateChars_InProgram {
	
	@Test
	public void example1()
	{
		String[] s= {"cat","mat","pat"};
		findDupsChars(s);
	}
	
	@Test
	public void example2()
	{
		String[] s= {"bb","bb","bb"};
		findDupsChars(s);
	}
	
	@Test
	public void example3()
	{
		String[] s= {"cat","maat","paat"};
		findDupsChars(s);
	}

	private void findDupsChars(String[] s) {
		// TODO Auto-generated method stub
		
		List<Character> li1 = new ArrayList();
		List<Character> li2 = new ArrayList();
	

		for(char ch :s[0].toCharArray())
		 {
		  li1.add(ch);
		 }

		for(int i=1;i<s.length;i++)
		{
		  for(char c:s[i].toCharArray())
		   {
		    li2.add(c);
		   }
		  li1.retainAll(li2);
		  li2.removeAll(li2);
		}
		System.out.println(li1);
	}

}
