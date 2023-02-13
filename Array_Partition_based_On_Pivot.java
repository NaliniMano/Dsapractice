package daily_dsa_prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Array_Partition_based_On_Pivot {
	
	@Test
	public void example1()
	{
		int[] nums= {9,12,5,10,14,3,10};
		int pivot=10;
		doPartition(nums,pivot);
	}

	private void doPartition(int[] nums,int pivot) {
		// TODO Auto-generated method stub
		   List<Integer> li_left= new ArrayList();
	        List<Integer> li_right= new ArrayList();
	        int midvalue=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]<pivot)
	            {
	                li_left.add(nums[i]);
	            }else if(nums[i]>pivot)
	                li_right.add(nums[i]);
	            else
	                midvalue++;
	        }
	//less value of pivot
	        for(int i=0;i<li_left.size();i++)
	        {
	            nums[i]=li_left.get(i);
	        }
	//equal to pivot    
	        int offset=li_left.size()+midvalue;
	        for(int j=li_left.size();j<offset;j++)
	        {
	            nums[j]=pivot;
	        }
	  //greater than pivot
	       for(int i=0;i<li_right.size();i++)
	        {
	            nums[offset+i]=li_right.get(i);
	        }
	    System.out.println(Arrays.toString(nums));    
	       
	       // 
	       //return nums;

	}

}
