package roundG2020;


import java.io.*;
import java.util.*;
import java.util.stream.LongStream;

public class Solution3 {
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
    

    private static long solve() throws IOException{
    	int countNumbers = sc.nextInt();
    	long dimNumbers = sc.nextLong();
    	long[] numbers = new long[countNumbers];
    	long count =0;
    	long min = Long.MAX_VALUE;
    	long[] numbersTaken = {};
    	
    	for(int i =0;i<countNumbers;i++) {
        	numbers[i] = sc.nextLong();
    	}
    	
    	for(int i = 0; i<countNumbers;i++) {
    		long refNumber = numbers[i];
    		if(!LongStream.of(numbersTaken).anyMatch(x -> x == refNumber)) {
    		
    		count = 0;
    		for(int j = 0; j <countNumbers;j++) {
    			long num1 = Math.abs(numbers[j] - refNumber);
    			long num2 = Math.min(numbers[j] , refNumber) + dimNumbers - Math.max(numbers[j] , refNumber);
    			count += Math.min(num1,num2);
    		}
    		min = ((min<count) ? min : count);
    		numbersTaken = appendArray(numbersTaken, refNumber);
    	}
    	}

    	
    	
    	return min;
    }
    
	private static long[] appendArray(long[] arr, long x) {
		long[] arr2 = new long[arr.length+1];
		
		for(int i =0; i<arr.length;i++) {
			arr2[i] = arr[i];
		}
		arr2[arr.length] = x;
		return arr2;
		
	}
    

}
