//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// } Driver Code Ends

//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
        if (n == 0) return 0;
        
        int x = largestPowerOf2(n); // Find the largest power of 2 ≤ n
        int bitsUpTo2X = x * (1 << (x - 1)); // Total set bits in [0, 2^x - 1]
        int msbFrom2XToN = n - (1 << x) + 1; // Set bits in numbers from [2^x, n]
        int remaining = countSetBits(n - (1 << x)); // Recursively count for remaining numbers
        
        return bitsUpTo2X + msbFrom2XToN + remaining;
    }

    // Function to find the largest power of 2 ≤ n
    static int largestPowerOf2(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }
        return x - 1;
    }
}


//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		
System.out.println("~");
}
	}
}

// } Driver Code Ends