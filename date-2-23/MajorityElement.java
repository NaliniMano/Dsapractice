package daily_dsa_prob;

import java.util.HashMap;

import org.junit.Test;

public class MajorityElement {
	/**
	 * 
	 * https://leetcode.com/problems/majority-element/
	 * 
	 * majority element occurs n/2 times.
	 * majority element always exists
	 * 
	 */
	
	@Test
	public void example1()
	{
		int[] nums= {3,2,3};
		findMajorityElement(nums);
	}
	
	@Test
	public void example2()
	{
		int[] nums= {3,3,3,2,3};
		findMajorityElement(nums);
	}
	
	@Test
	public void example3()
	{
		int[] nums= {3};
		findMajorityElement(nums);
	}
	
	/***
	 * 1. iterate gvn array
	 * 2. chk if the entry exist in hashmap
	 *        get the values  compare its greater than n/2
	 *        else
	 *        add to map
	 *         key -> element
	 *         values -> occurance
	 *         
	 * 
	 * 
	 * 
	 * @param nums
	 */

	private int findMajorityElement(int[] nums) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hmap =new HashMap();
		for(int i=0;i<nums.length;i++)
		{
			hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
			if(hmap.get(nums[i]) > nums.length/2 )
				{
					System.out.println(nums[i]);
					return nums[i];
				}
		
		}
	return -1;	
	}

}
