package daily_dsa_prob;

import org.junit.Test;

public class MaxAvg {
	
	@Test
	public void example1()
	{
		int[] nums= {-2,-3,1};
		int k=2;
		findMaxAvgSub(nums,k);
	}

	private void findMaxAvgSub(int[] nums, int k) {
		// TODO Auto-generated method stub
		double avg=0.0, max=0.0;
		int sum=0,index=0;

		for(int i=0;i<k;i++)
		 {
		   sum+=nums[i];
		 }
		avg=sum/k;
		max=avg;

		for(int i=k;i<nums.length;i++)
		 {
		   sum+=nums[i]-nums[index];
		   avg=sum/k;
		   max=Math.max(max,avg);
		 }
		System.out.println(max);
		//return max;
	}
	
	
	

}
