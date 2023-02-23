package daily_dsa_prob;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



public class KeyBoard_Problem {
	/***********
	 * 
	 * https://leetcode.com/problems/keyboard-row/
	 */
	
	@Test
	public void example1()
	{
		
		String[] words= { "Hello","Alaska","Dad","Pen"};
		findKeyBoardRow(words);
	}

	
	@Test
	public void example2()
	{
		
		String[] words= { "asfde"};
		findKeyBoardRow(words);
	}
	private void findKeyBoardRow(String[] words) {
		// TODO Auto-generated method stub
		String first_row="qwertyuiopQWERTYUIOP";
		String second_row="asdfghjklASDFGHJKL";
		String third_row="zxcvbnmZXCVBNM";
	List<String> li =new ArrayList();
		for(int i=0;i<words.length;i++)
		{
			int count1=0,count2=0,count3=0,len=words[i].length();
		
			for(int j=0;j<len;j++)
			{
				 if(first_row.contains(Character.toString(words[i].charAt(j))))
					 count1++;
				 else if(second_row.contains(Character.toString(words[i].charAt(j))))
					 count2++;
				 else if(third_row.contains(Character.toString(words[i].charAt(j))))
					 
					 count3++;
				 if(count1 == len ||count2 == len || count3 == len)
				 {
					 li.add(words[i]);
					 
				 } 
			}
			
		}
		System.out.println("List"+li);
	}

}
