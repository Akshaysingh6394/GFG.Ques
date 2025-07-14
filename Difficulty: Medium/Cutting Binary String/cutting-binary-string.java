class Solution {
    Integer [] dp;
    public int cuts(String s) {
        // code here
     
      dp =new Integer[s.length()+1];
       int ans=dfs(s,0);
        return ans==1000?-1:ans;
    }
    public int dfs(String s,int idx)
    {
        if(idx>=s.length()) return 0;
        if(dp[idx]!=null) return dp[idx];
        int ans=1000;
        
        for(int i=idx+1;i<=s.length();i++)
        {
            if(isValid(s.substring(idx,i)))
            {
              //  System.out.println(s.substring(idx,i));
                ans=Math.min(ans,1+dfs(s,i));
            }
        }
        return dp[idx]=ans;
        
    }
    public boolean isValid(String s)
    {
        int number=Integer.parseInt(s,2);
        if(s.charAt(0)=='0') return false;

        while(number>1)
        {
            //System.out.println(number);
            if(number%5!=0) return false;
            number/=5;
        }
       // System.out.println(s);
        return true;
    }
}
