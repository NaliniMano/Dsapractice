package daily_dsa_prob;

import org.junit.Test;
import java.util.*;
public class ThreeSum_ThreeTriplet {
	
	@Test
	public void example()
	{
		int[] nums= {-1,0,1,2,-1,-4};
		findThreeSum(nums);
	}

	private void findThreeSum(int[] nums) {
		// TODO Auto-generated method stub
		/**  List<List<Integer>> li2 =new ArrayList();
		     
		  for(int i=0;i<nums.length;i++)
		  {
		  for(int j=i+1;j<nums.length;j++)
		   {
		    for(int k=j+1;k<nums.length;k++)
		    
		     {
		 	
		 	  if( (nums[i]+nums[j]+nums[k])==0)
		 	   {
		 		  System.out.println(i+","+j+","+k);
				  List<Integer> li =new ArrayList();

		 	      li.add(nums[i]);
		 		  li.add(nums[j]);
		 		  li.add(nums[k]);
		          
		           System.out.println(li);
		           li2.add(li);
		         //  li.removeAll(li); 
		          
		 	   }
		         
		 	 
		      
		     }	**/
		    
		    
		      Set<List<Integer>> ans = new HashSet<>();
		       
		        Arrays.sort(nums);

		        for (int i = 0; i < nums.length; i++) 
		            for (int j = i + 1; j < nums.length; j++) 
		                for (int k = j + 1; k < nums.length; k++) 
		                    if (nums[i] + nums[j] + nums[k] == 0) 
		                    {
		                    	System.out.println(nums[i]+","+nums[j]+","+nums[k]);
		                        ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
		                    }
		                 
 System.out.println(ans);
		       
	}


		//  System.out.println("%%%%%%%"+li2);

}