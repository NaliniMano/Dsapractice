package daily_dsa_prob;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class FareCandy_swap {
	
	@Test
	public void example1()
	{
		int[] alice= {1,1};
		int[] bob= {2,2};// output{1,2}
		doCandySwap(alice,bob);
		
		
	}

	private void doCandySwap(int[] alice, int[] bob) {
		// TODO Auto-generated method stub
		
		/**
		 * find the total candy of alice & bob
		 * find the mid
		 * iterate alice array
		 * find remaing choc=mid- alice[i]
		 * chk if remaingg found in bob
		 * if match occur store in output & return
		 * 
		 * 
		 
		 */
		int alice_tot=0,bob_tot=0;
		int[] output =new int[2];
		HashSet<Integer> hs =new HashSet();
		
		   for(int k=0;k<alice.length;k++)
		{
			alice_tot+=alice[k];
		}
		   for(int k=0;k<bob.length;k++)
		{
			bob_tot+=bob[k];
			hs.add(bob[k]);
			
		}
		
		int mid=(alice_tot+bob_tot)/2;
		for(int i=0;i<alice.length;i++)
		{
			int rem = mid - (alice_tot - alice[i]);
			if(hs.contains(rem))
			{
				        output[0]=alice[i];
						output[1]=rem;
			}
		}
		
		System.out.print(Arrays.toString(output));
	}

}
