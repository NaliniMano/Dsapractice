package daily_dsa_prob;

import org.junit.Test;

public class FindMeeting_Interval {
	
	//@Test
	public void example1()
	{
		
		int[][] interval= {{0,30},{5,10},{15,40}};
		findAnyOverLapMeeting(interval);
	}
	
	//@Test
	public void example2()
	{
		
		int[][] interval= {{0,5},{5,10},{15,40}};
		findAnyOverLapMeeting(interval);
	}
	
	@Test
	public void example3()
	{
		
		int[][] interval= {{0,5},{5,10},{9,40}};
		findAnyOverLapMeeting(interval);
	}

	private void findAnyOverLapMeeting(int[][] interval) {
		// TODO Auto-generated method stub
		boolean isMeeting_overlap=false;
		for(int i=0;i<interval.length-1;i++)
		{
			for(int j=0;j<interval[i].length-1;j++)
			{
				
				if(interval[i][j+1] > interval[i+1][j])
				{

					isMeeting_overlap=true;
					System.out.println("OverLap");
				}
			}
			
		}
        if(!isMeeting_overlap) System.out.println("No OverLap");
	}

}
