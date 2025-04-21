//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t > 0) {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();
            System.out.println(obj.transitionPoint(arr));
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    int transitionPoint(int arr[]) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                return i;
                //break;
            }
        }
        return -1;
    }
}