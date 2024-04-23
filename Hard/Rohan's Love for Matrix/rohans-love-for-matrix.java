//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.firstElement(n));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int firstElement(int n) {
        // code here
        int a=1,b=0;
        for(int i=2;i<=n;i++){
            int temp=a;
            a=(a+b)%1000000007;
            b=temp;
        }
        return a%1000000007;
    }
}