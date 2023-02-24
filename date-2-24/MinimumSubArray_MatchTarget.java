package daily_dsa_prob;

import org.junit.Test;

public class MinimumSubArray_MatchTarget {
	/**
	 * https://leetcode.com/problems/minimum-size-subarray-sum/
	 * 
	 */
	
	@Test
	public void example1()
	{
		 int[] nums= {2,3,1,2,4,3};
		 int target=7;
		 findMinSubArray(nums,target);
	}
	
	

	@Test
	public void example2()
	{
		 int[] nums= {1,2,2,2,2};
		 int target=11;
		 findMinSubArray(nums,target);
	}
	
	@Test
	public void example3()
	{
		 int[] nums= {1,4,4};
		 int target=4;
		 findMinSubArray(nums,target);
	}
	
	private int findMinSubArray(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left=0,right=0,min=Integer.MAX_VALUE,sum=0;
		
		while(right<nums.length)
		{
			sum+=nums[right];
			while(sum>=target)
			{
				min=Math.min(min,(right-left)+1);
				sum-=nums[left++];
				
			}
			right++;
		}
		
		if(min == Integer.MAX_VALUE) min=0;
		return min;
	}

}
