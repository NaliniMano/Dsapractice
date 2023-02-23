package daily_dsa_prob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.junit.Test;

public class TownJudge {
	
	@Test
	public void example1()
	{
		int[][] trust = {{1,2}};
		int n=2;
		findJudge(trust,n);
	}

	
	private void findJudge(int[][] trust, int n) {
		// TODO Auto-generated method stub
		//Arrays.sort(trust);
		//System.out.println(Arrays.deepToString(trust));
		HashMap<Integer,Integer> hmap =new HashMap();
		for(int i=0;i<trust.length;i++)
		 {
		 for(int j=0;j < trust[i].length-1;j++)
		  {
		     //System.out.println(trust[i][j] +","+trust[i][j+1]);
		    hmap.put(trust[i][j],trust[i][j+1]);
		   }
		 }
		
		int currvalue=0,preval=trust[0][1],judge=-1;
		
		Map<Integer, Integer> sortedMap = 
				hmap.entrySet().stream()
			     .sorted(Entry.comparingByValue())
			     .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
			                               (e1, e2) -> e1, LinkedHashMap::new));
		
		
		
		
		
		
		for(Map.Entry<Integer,Integer> m : sortedMap.entrySet())
		{
		  currvalue=m.getValue();
		  if(currvalue ==preval)
		  {
		    judge=m.getValue();
		  }else
		  {
		      judge=-1;
		    continue;
		  }
		  preval=currvalue;
		}
		System.out.println(judge);  
		
	}


	@Test
	public void example2()
	{
		int[][] trust = {{1,3},{2,3}};
		int n=3;
		findJudge(trust,n);
		
	}
	
	@Test
	public void example3()
	{
		
		int[][] trust = {{1,3},{4,1},{2,3}};
		int n=4;
		findJudge(trust,n);
	}
}
