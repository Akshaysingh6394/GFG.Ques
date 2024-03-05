//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    
    ArrayList<Integer> search(String p, String t)
    {
        // your code here
       p= p.trim();
       t= t.trim();
        int m=p.length(), n=t.length();
        ArrayList<Integer> ans=new  ArrayList<Integer>();
        if(m==0 || n==0)return ans;
        
        for(int i=0;i<n-m+1;i++){
            int k=0, j=0;
            for(j=0;j<m && i + k < n;j++){
                if ( p.charAt(k) != t.charAt(i + k)){
                    break;
                }
                //System.out.println(i+" j=" +j);
                k++;
            }
            
            if(k==m)ans.add(i+1);
        }
        
        return ans;
    }
}