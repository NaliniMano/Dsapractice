package daily_dsa_prob;

import org.junit.Test;

public class PowersOfThree {
	
	@Test
	public void example1()
	{
		int n=45;
		findPowersOfThree(n);
	}

	private boolean findPowersOfThree(int n) {
		// TODO Auto-generated method stub
		while(n>1)
		{
			if(n%3!=0) return false;
			n=n/3;
		}
		
		return true;
	}

}
