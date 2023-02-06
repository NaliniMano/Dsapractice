package daily_dsa_prob;

public class MaxProductSubarray {
	
	public void example1()
	{
		int[] nums= {};
		findMaxProduct(nums);
		
	}

     /**
     find the prod each element from the  given array
      compare and find the max prod
     if prod < 0 reset prod=1
     
     find the prod of each element in reverese direction
     compare and find the max prod
     return max product


      time complexity o[n]  
     **/
       

	private void findMaxProduct(int[] nums) {
		// TODO Auto-generated method stub
	      int prod=1,max=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++)
	        {
	            prod=prod*nums[i];
	            max=Math.max(prod,max);
	          
	            if(prod == 0)
	            {
	                prod=1;
	            }   
	             
	        }
	        prod=1;
	      
	        
	         for(int i=nums.length-1;i>=0 ;i--)
	        {
	            prod=prod*nums[i];
	           
	            max=Math.max(prod,max);
	          
	            if(prod == 0)
	            {
	                prod=1;
	            }   
	           
	        }
	        prod=1;
	        

	     System.out.println("MAx-Product"+max);                                                               
	   // return max;
	}

}
