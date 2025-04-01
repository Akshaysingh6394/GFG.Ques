//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		
System.out.println("~");
}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        // return (n & (-n));    
          while ( n != 0) {
            int bits = n & ((~n) + 1);
            if (bits != 0) {
                return (int)(Math.log(bits) / Math.log(2)) + 1;
            }
            n ^= bits;
        }    
        
        return 0;
    }
}