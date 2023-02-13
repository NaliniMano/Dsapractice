package daily_dsa_prob;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Rotate_Image_2D_Matrix {

	
    // Leetcode_ 48 : https://leetcode.com/problems/rotate-image/
    @Test
    public void example1() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //output = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        flip_matrix(input);
        
        
    }

    @Test
    public void example2() {
        int[][] input = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        //output = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        flip_matrix(input);
        

       
    }

    @Test
    public void example3() {
        int[][] input = {{1, 2}, {4, 5}};
         //output = {{4, 1}, {5, 2}};
        flip_matrix(input);
        

      
    }

    /* Pseudo code :
        1. swap the matrix of 
        2. Then reverse each row
     */

    //TC : O(N^2)

    public void flip_matrix(int[][] matrix) {

        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix[i].length; j++){
             int temp=matrix[i][j];
             matrix[i][j]=matrix[j][i];
             matrix[j][i]=temp;
            }
        }

   //     System.out.println(Arrays.toString(matrix));
        for(int i=0;i<matrix.length;i++) {
          int left=0;
          int right=matrix.length-1;
          while(left<=right)
          {
        	  int temp =matrix[i][left];
        	  matrix[i][left]=matrix[i][right];
        	  matrix[i][right]=temp;
        	  left++;
        	  right--;
          }
        }
        
     System.out.println(Arrays.deepToString(matrix));

    }

	
	
}
