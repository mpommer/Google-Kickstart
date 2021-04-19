package roundG2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	    static Scanner sc = new Scanner(System.in);
	    static PrintWriter out = new PrintWriter(System.out);
	    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    long mod = 1000000000+7;
	    public static void main(String[] args)throws IOException {

	        int T = sc.nextInt();
     	    String FirstLine = sc.nextLine();
	        for(int i=1;i<=T;i++){
	        	   System.out.print(String.format("Case #%d: ",i));
	        	   String nextLine = sc.nextLine();
	           	   System.out.println(solve(nextLine));                 
	        }
	        out.flush();
	    }
	    
	    
	    private static long solve(String nextLine) {
	    	int length = nextLine.length();
	    	String[] string = nextLine.split("");
	    	long[] kick = new long[length]; 
	    	long[] start = new long[length];

	    	for(int i = 0; i<length-4;i++) {
	    		if(string[i].equals("K")) {
				
	    			if(string[i+1].equals("I")) {
	    				if(string[i+2].equals("C")) {
	    					if(string[i+3].equals("K")) {
	    						kick[i] = 1;
	    					}
	    				}
	    			}
	    			
	    		} else if(string[i].equals("S")) {
	    			if(string[i+1].equals("T")) {
	    				if(string[i+2].equals("A")) {
	    					if(string[i+3].equals("R")) {
	    						if( string[i+4].equals("T")) {
	    							start[i] = 1;
	    						}
	    					}
	    				}
	    			}
	    		}
	    	}
	    	
	    	long countStart = 0;
	    	long countLucky = 0;
	    	for(int i = length-4; i>=0;i--) {
	    		if(kick[i] == 1) {
	    			countLucky += countStart;
	    		}
	    		if(start[i] == 1) {
	    			countStart ++;
	    		}
	    	}
	    	
	    	
	    	return countLucky;
	    }

}
