// User function Template for Java

class Solution {
    boolean allZero(int frea[]){
        for(int num : frea){
            if(num != 0){
                return false;
            }
        }
        return true;
    }

    int search(String pat, String txt) {
        // code here
        int n = txt.length();
        int frea[] = new int[26];
        for(int i=0;i<pat.length();i++){
            char ch = pat.charAt(i);
            frea[ch-'a']++;
        }
        int i=0,j=0;
        int result = 0;
        while(j<n){
            char chh = txt.charAt(j);
            frea[chh -'a']--;
            if(j-i+1 == pat.length()){
                if(allZero(frea)){
                    result++;
                }
                frea[txt.charAt(i) -'a']++;
                i++;
            }
            j++;
        }
        return result;
    }
}