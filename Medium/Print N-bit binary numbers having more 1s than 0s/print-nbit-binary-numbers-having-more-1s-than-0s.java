//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
     void helper(int N,ArrayList<String> myList,String currString,int val1,int val0){
        if(val1+val0==N){
            myList.add(currString);
            return;
        }
        helper(N,myList,currString+"1",val1+1,val0);
        if(val1>=val0+1) helper(N,myList,currString+"0",val1,val0+1);
    }
    
    ArrayList<String> NBitBinary(int N) {
        // code here
        ArrayList<String> myList=new ArrayList<>();
        String currStr="1";
        helper(N,myList,currStr,1,0);
        return myList;
    }
}