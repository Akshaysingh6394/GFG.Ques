//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            // Read the array from input line
            String inputLine = read.readLine().trim();
            String[] inputArr = inputLine.split("\\s+");
            int n = inputArr.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputArr[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findDuplicate(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        Arrays.sort(arr);
        int ans = 0;
        // int left = 0;
        // int right = arr.length-1;
        // while(left<right){
        //     if(arr[left]==arr[right]){
        //         ans =arr[left];
        //     }
        //     left++;
        //     right--;
        // }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                ans = arr[i];
            }
        }
        
        return ans;
    }
}