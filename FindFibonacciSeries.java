package daily_dsa_prob;

import org.junit.Test;

public class FindFibonacciSeries {
	
	@Test
	public void example1()
	{
		int num=4;
		findFibo(num);
	}

	private void findFibo(int num) {
		// TODO Auto-generated method stub
		
		int n1=0,n2=1,n3=0;
		
		for(int i=1;i<num;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println(n3);
	}

}
