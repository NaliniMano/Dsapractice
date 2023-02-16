package daily_dsa_prob;

import java.util.HashSet;

import org.junit.Test;

public class Arithmetic_Triplet {
	
	/**
	 * 
	 * https://leetcode.com/problems/number-of-arithmetic-triplets/submissions/
	 * 
	 * testdata:
	 * Input: nums = [4,5,6,7,8,9], diff = 2
       Output: 2

	 * Input: nums = [0,1,4,6,7,10], diff = 3
       Output: 2

	 * 
	 * 
	 */
	@Test
	public void example1()
	{
		int[] nums= {4,5,6,7,8,9};
		int diff=2;
		findArithmeticTriplet(nums,diff);
	}
	
	
	@Test
	public void example2()
	{
		int[] nums= {0,1,4,6,7,10};
		int diff=3;
		findArithmeticTriplet(nums,diff);
	}


	private void findArithmeticTriplet(int[] arr, int diff) {
		// TODO Auto-generated method stub
		
	     HashSet<Integer> hs =new HashSet();
	       for(int i :arr)
	       {
	          hs.add(i); 
	       }
	        int count=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(hs.contains(arr[i]-diff) && hs.contains(arr[i]+diff))
	            {
	                count++;
	            }
	        }
	        
	        System.out.println(count);

		
		
	}

}
