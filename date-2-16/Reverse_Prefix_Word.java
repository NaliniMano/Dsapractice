package daily_dsa_prob;

import org.junit.Test;

public class Reverse_Prefix_Word {
	
	@Test
	public void example1()
	{
		String  word = "abcdefd", ch = "d";
		doReverseOfPrefix(word,ch);

	}

	private void doReverseOfPrefix(String word, String ch) {
		// TODO Auto-generated method stub
		
		String start= word.substring(0,word.indexOf(ch)+1);
		String end= word.substring(word.indexOf(ch)+1,word.length());
		
		StringBuffer sb =new StringBuffer();
		sb.append(start);
		sb.reverse();
		sb.append(end);
		
		System.out.println(sb.toString());
	}

}
