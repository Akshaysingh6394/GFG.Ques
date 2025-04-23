//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSingle(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSingle(int[] arr) {
        // code here
        //  int tn = Integer.MAX_VALUE;
        //  int tnp1 = 0;
        //  int tnp2=0;
        // for (int i = 0; i < arr.length; i++) {
        //     int cwtn = arr[i] & tn;
        //     int cwtnp1 = arr[i] & tnp1;
        //     int cwtnp2 = arr[i] & tnp2;

        //     tn = tn & (~cwtn);
        //     tnp1 = tnp1 | cwtn;

        //     tnp1 = tnp1 & (~cwtnp1);
        //     tnp2 = tnp2 | cwtnp1;

        //     tnp2 = tnp2 & (~cwtnp2);
        //     tn = tn | cwtnp2;
        // }

        //  return tnp1;
                int ones = 0, twos = 0;

        for (int num : arr) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }
}