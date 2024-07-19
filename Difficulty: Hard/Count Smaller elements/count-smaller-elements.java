//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int arr[] = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }

            int[] ans = new Solution().constructLowerArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public int[] constructLowerArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(arr[i], i);
        }
        mergeSort(pairs, result, 0, n - 1);
        return result;
    }

    private void mergeSort(Pair[] pairs, int[] result, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(pairs, result, left, mid);
        mergeSort(pairs, result, mid + 1, right);
        merge(pairs, result, left, mid, right);
    }

    private void merge(Pair[] pairs, int[] result, int left, int mid, int right) {
        int n = right - left + 1;
        Pair[] temp = new Pair[n];
        int i = left, j = mid + 1, k = 0;
        int rightCount = 0;

        while (i <= mid && j <= right) {
            if (pairs[i].value > pairs[j].value) {
                rightCount++;
                temp[k++] = pairs[j++];
            } else {
                result[pairs[i].index] += rightCount;
                temp[k++] = pairs[i++];
            }
        }

        while (i <= mid) {
            result[pairs[i].index] += rightCount;
            temp[k++] = pairs[i++];
        }

        while (j <= right) {
            temp[k++] = pairs[j++];
        }

        for (i = left; i <= right; i++) {
            pairs[i] = temp[i - left];
        }
    }
}