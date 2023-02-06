package daily_dsa_prob;

public class Gasstation {
	
public void example1()
	{
		int[] gas = {1,2,3,4,5};
	   int[] cost = {3,4,5,1,2};
		completeRotation(gas,cost);
	}

	
    /**
    1.intial start index calcualtion
    find sum of gas and cost sum
     if gas >=cost  
        calcualte the start index
      else
         return -1
         
    temp sum + = gas[i]-cost[i] ;
    if(tempsum < 0)
      tempsum = 0;
      tempindex=current_index+1

 time complexity-> o[n]
    **/
	private int  completeRotation(int[] gas, int[] cost) {
		// TODO Auto-generated method stub
		int gascount=0,costcount=0,tempsum=0,tempindex=0;
		for(int i=0;i<gas.length;i++)
		{
			gascount+=gas[i];
			costcount+=cost[i];
		}
		
		if(gascount <  costcount) return -1;
		
		for(int i=0;i<gas.length;i++)
		{
			
		 tempsum+=gas[i]-cost[i];
		 if(tempsum < 0)
		 {
			 tempsum=0;
             tempindex=i+1;
		 }
		}
		return tempindex;
		
	}



}
