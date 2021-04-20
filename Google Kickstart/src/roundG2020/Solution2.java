package roundG2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution2 {

	 static Scanner sc = new Scanner(System.in);
	    static PrintWriter out = new PrintWriter(System.out);
	    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    long mod = 1000000000+7;
	    public static void main(String[] args)throws IOException {

	        int T = sc.nextInt();
  	    
	        for(int i=1;i<=T;i++){
	        	   System.out.print(String.format("Case #%d: ",i));
	        	  
	           	   System.out.println(solve());                 
	        }
	        out.flush();
	    }
	    
	    
	    private static long solve() {
	    	int dim = sc.nextInt();
	    	long max = Long.MIN_VALUE;
	    	long[][] matrix = new long[dim][dim];
	    	
	    	for(int i = 0;i<dim;i++) {
	    		for(int j=0;j<dim;j++) {
	    			matrix[i][j] = sc.nextLong();
	    		}	    		
	    	}	
	    	
	    	for(int i = 0; i<dim;i++) {
	    		if(i == 0) {
	    		for(int k = 0;k<dim;k++) {
	    			long sum = 0;
	    			for(int m = i,n = k;m<dim & n<dim;m++,n++) {
	    				sum += matrix[m][n];	    				
	    			}
	    			max = Math.max(max, sum);
	    		}
	    		}else {
	    			long sum = 0;
	    			for(int m = i,n = 0;m<dim & n<dim;m++,n++) {
	    				sum += matrix[m][n];	    				
	    			}
	    			max = Math.max(max, sum);
	    		}
	    			
	    		}
	    	
	    	
	    	return max;
	    }


}
