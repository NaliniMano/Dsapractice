package daily_dsa_prob;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class Find_Common_Element_3Array {
	
	@Test
	public void example1()
	{
		int[] array1= {1,2,3};
		int[] array2= {2,3,4};
		int[] array3= {3,7,9};
		findCommonElement(array1,array2,array3);
	}
	
	@Test
	public void example2()
	{
		int[] array1= {1,2,3,4,5};
		int[] array2= {1,2,5,7,9};
		int[] array3= {1,3,4,5,8};
		findCommonElement(array1,array2,array3);
		
		
	}


	@Test
	public void example3()
	{
		int[] array1= {1,2,3};
		int[] array2= {4,5,6};
		int[] array3= {3,4,9};
		findCommonElement(array1,array2,array3);
	}

	private List<Integer> findCommonElement(int[] array1, int[] array2, int[] array3) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet();
		List<Integer> li =new ArrayList();
		List<Integer> final_li =new ArrayList();

		for(int i=0;i<array1.length;i++)
		 {
		   hs.add(array1[i]);
		 }
		 
		for(int j=0;j<array2.length;j++)
		  {
		    if(hs.contains(array2[j])) li.add(array2[j]);
		  }
		if(li.isEmpty()) return li;
		for(int k=0;k<array3.length;k++)
		  {
		    if(li.contains(array3[k]))
			 {
			    final_li.add(array3[k]);
			  }
		  }
		System.out.println(final_li);
		 return final_li;
	}
}
