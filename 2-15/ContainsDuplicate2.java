package daily_dsa_prob;

import java.util.HashMap;

import org.junit.Test;

public class ContainsDuplicate2 {
	
	@Test
	public void example1()
	{
		int[] nums= {1,2,3,1};
		int k=3;
		findDuplicates(nums,k);
	}
	
private boolean findDuplicates(int[] nums, int k) {
		// TODO Auto-generated method stub
	HashMap<Integer,Integer> hmap = new HashMap();

	for(int i=0;i<nums.length;i++)	 
	{
	    if(hmap.containsKey(nums[i]))
	    {
	      if(Math.abs(i-hmap.get(nums[i]))<=k) return true;

	    }
	    
	    hmap.put(nums[i],i);
	    
	}
	 return false;

	}

	//	@Test
	public void example2()
	{
		int[] nums= {1,0,1,1};
		int k=1;
		findDuplicates(nums,k);
	}



}
