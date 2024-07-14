//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int s = sc.nextInt();
            int d = sc.nextInt();

            Solution obj = new Solution();
            String res = obj.smallestNumber(s, d);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends



class Solution {
    public String smallestNumber(int s, int d) {
        
       
       String ans="";
       int []arr=new int[d];
       arr[0]=1;
       for(int i=1;i<d;i++){
           arr[i]=0;
       }
       s=s-1;
       for(int i=arr.length-1;i>=0;i--){
           if(i==0 && s>=8){
               arr[i]=9;
               s=s-8;
           }
           else if(s>=9){
               arr[i]=9;
               s=s-9;
           }
           else{
               arr[i]=arr[i]+s;
               s=0;
               break;
           }
       }
       if(s!=0)return ""+-1;
       
       for(int i=0;i<arr.length;i++){
           ans=ans+arr[i];
       }
       
       return ans;
    }
}
