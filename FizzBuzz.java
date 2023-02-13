package daily_dsa_prob;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FizzBuzz {
	
	@Test
	public void example1()
	{
		int n= 15;
		findFizzBuzz(n);
		
	}

	private void findFizzBuzz(int n) {
		// TODO Auto-generated method stub
		 /**
        n=2 -->  {1,2}
        n=4 --> {1,2,"Fizz",4}
        n=9 -> {1,2,"FIZZ",4,Buzz,Fizz,7,8,fizz}
        
        
        
        iterate the from 1 to n
        check if gvn num divisible  by 3 
                list -> add string fizz
         else divisible by 5
          list -> add string buzz
         else devisible by 3& 5
           list -> add string fizzbuzz
         else 
           list -> add number
        ***/
        List<String> li =new ArrayList();
        for(int i=1;i<=n;i++)
        {
          if(i%3==0 && i%5 ==0)
          {
              li.add("FizzBuzz");
          }else if(i % 3 == 0) li.add("Fizz");
           else if(i % 5 == 0) li.add("Buzz");
           else li.add(""+i );
            
        }
        
       System.out.println(li);
	}

}
