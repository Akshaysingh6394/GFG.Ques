class Solution {
    long countStrings(String s) {
        // code here
         HashMap<Character,Integer> map = new HashMap<>();
       long sum = 0;
       for(int i = 0; i <= s.length() - 1; i++){
           map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
       }
        long n = (long)s.length();
        long ans =  n*(n - 1)/2;
       if(map.size() == s.length()){
           return ans;
       }else{
         for(Character k : map.keySet()){
             long p = map.get(k);
             sum += p*(p - 1)/2;
         }  
       }    
        
        return (ans - sum + 1);
    }
}