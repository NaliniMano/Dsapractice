package daily_dsa_prob;

import java.util.Arrays;

import org.junit.Test;

public class FlippingImage {
	
	@Test
	public void example1()
	{
		int[][] image= {{1,1,0},{1,0,1},{0,0,0}}; //Output: [[1,0,0],[0,1,0],[1,1,1]]
        flipImage(image);
	}

	private void flipImage(int[][] image) {
		// TODO Auto-generated method stub
		for(int i=0;i<image.length;i++)
        {
           int left=0,right=image[i].length-1;
            while(left < right)
            {
                int temp =image[i][left];
                image[i][left] =image[i][right];
                image[i][right] = temp;
                left++;
                right--;
                
            }
        }
        
                for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
      //  return image;
                System.out.println(Arrays.deepToString(image));

	}

}
