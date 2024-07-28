//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String str) {
        HashSet<Character> set=new HashSet<>();
        StringBuilder ans=new StringBuilder();
        for(char c:str.toCharArray()){
            if(!set.contains(c)){
                ans.append(c);
            }
            set.add(c);
        }
     return ans.toString();   
    }
}

