package daily_dsa_prob;

import java.util.Arrays;

import org.junit.Test;

public class Array_Parition1 {
	
	@Test
	public void example1()
	{
		int[] nums= {1,4,3,2};
		doPartion(nums);
	}

	private void doPartion(int[] nums) {
		// TODO Auto-generated method stub
		/**
        1)sort the given array
        2) iterate through the element
        3 ) find minium from current elemt  & next element
            and sum it
        4) return the sum
        
        **/
       
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-1;i += 2)
        {
           sum+=Math.min(nums[i],nums[i +1 ]);
            System.out.println(sum);
         
        }
       
        System.out.println(sum);
	}

}
