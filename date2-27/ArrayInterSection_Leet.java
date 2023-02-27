package hwprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class ArrayInterSection_Leet {
	/*
	 * Question here !!
	 * arrayInter-ssection -prob1
	 */

	@Test // +ve
	public void example1() {
		int[] num1= {4,9,5};
		int[] num2= {9,4,9,8,4};
		findInterSection(num1,num2);
	}

	
	@Test // negative
	public void example2() {
		int[] num1= {1,2,3};
		int[] num2= {4,5,6};
		findInterSection(num1,num2);
	}
	
	@Test // edge
	public void example3() {
		int[] num1= {3};
		int[] num2= {2,3,4,0};
		findInterSection(num1,num2);
	}
	/**
	 * 
	 * 1. find size of output array
     2.  use outer   & inner loop   and compare and store the result in output array
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	
	
	
	private int[] findInterSection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs =new HashSet();
        List<Integer> li = new ArrayList();
        
        for(int i: nums1)
        {
            hs.add(i);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(hs.contains(nums2[i]) && !li.contains(nums2[i]))
            {
                li.add(nums2[i]);
            }
        }
      int[] output =new int[li.size()];  
        
        for(int j=0;j<li.size();j++)
        {
            output[j]=li.get(j);
        }
        return output;
		    }
	
	public int[] findInterSection_twopointer(int[] nums1, int[] nums2) {
		 int count=0;   
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        
	        int left=0,right=0;
	        List<Integer> li =new ArrayList<Integer>();
	        
	        	  while(left<nums1.length && right <nums2.length)
	  	        {
	  	            if(nums1[left]==nums2[right])
	  	            {
	  	                if(! (li.contains(nums1[left])))
	  	                {
	  	             li.add(nums1[left]);
	  	                }
	  	                left++;
	  	                right++;
	  	            }else if(nums1[left] < nums2[right])
	  	            {
	  	                left++;
	  	            }else
	  	            {
	  	                right++;
	  	            }
	  	        }
	        
	        int[] output =new int[li.size()];
	        for(int i=0;i< li.size();i++)
	        {
	            output[i]=li.get(i).intValue();
	        }
	        return output;
	}

}
