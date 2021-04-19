package readingInput;

import java.io.*;
import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 1000000000+7;
    public static void main(String[] args)throws IOException {

        int T = sc.nextInt();
        for(int i=1;i<=T;i++){
        	long n  =sc.nextLong(), k = sc.nextLong();
            System.out.print(String.format("Case #%d: ",i));
            System.out.println(solveFromZero(k) - solveFromZero(n-1));

                     
        }
        out.flush();
    }
    
   /* 
    private static long solve() throws IOException{
        long n  =sc.nextInt(), k = sc.nextInt();
        long count = 0;
        for(long i = n; i <= k; i++) {
        	if(boringNumber(i)) {
        		count++;
        		}
        }
       
        return count;
    }*/
    
    public static boolean boringNumber(long x) {
    	int length = String.valueOf(x).length();
    	long[] numbers = new long[length];
    	long i = 0;
    	
		while (x > 0) {
		    numbers[(int) (length - i -1)] = x % 10;
			x = x / 10;		 
		    i++;
		    
		}		
		for(int j = 1; j<=length;j++) {
			if(j % 2 == 1 ) {
				if((numbers[j-1] % 2) != 1) {
					
					return false;
				}
			} else {
				if((numbers[j-1] % 2) != 0) {
				return false;
				}
			}
			
		}		
		return true;
		
    }
    
    private static long solveFromZero(long x) throws IOException{
        long count = 0;
        long dim = String.valueOf(x).length() - 1;

        
        for(int k=1; k<=dim;k++) {
        count += Math.pow(5, k);
        }

        long newx = (long) Math.pow(10, dim);
        while(newx +  Math.pow(10, dim) <= x) {
        	
        	count += Math.pow(5, dim);
        	newx += 2 * Math.pow(10, dim);
        }
        if(newx + Math.pow(10, dim) <= x) {
        	newx +=  Math.pow(10, dim);
        }
        		
        for(long i = newx; i <= x; i++) {
        	if(boringNumber(i)) {
        		count++;
        		}
        }
       
        return count;
    }
    

}






