//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int key = Integer.parseInt(in.readLine().trim());

            out.println(new Solution().search(arr, key));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        return searchInRotatedSortedArray(arr,key,0,arr.length-1);
    }
    int searchInRotatedSortedArray(int[] arr,int key,int low,int high){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==key) return mid;
        if(arr[low]<=arr[mid]){
            if(arr[low]<=key&&arr[mid]>key){
               return searchInRotatedSortedArray(arr,key,low,mid-1);
            }else{
               return searchInRotatedSortedArray(arr,key,mid+1,high);
            }
            
        }
        if(arr[mid]<=arr[high]){
            if(arr[mid]<key&&arr[high]>=key){
               return searchInRotatedSortedArray(arr,key,mid+1,high);
            }else{
               return searchInRotatedSortedArray(arr,key,low,mid-1);
            }
            
        }
        return -1;
    }
}