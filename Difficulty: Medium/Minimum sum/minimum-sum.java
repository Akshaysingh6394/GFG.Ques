class Solution {
    String getSum(String s1,String s2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int n = s1.length();
        int m = s2.length();
        int i = 0;
        int j = 0;
        
        while(i < n || j < m) {
            int d1 = (i < n) ? Integer.parseInt(s1.charAt(i++) + "") : 0;
            int d2 = (j < m) ? Integer.parseInt(s2.charAt(j++) + "") : 0;
            
            int s = d1 + d2 + carry;

            int d = s % 10;
            carry = s / 10;
            
            sb.append(d + "");
        }
        
        if(carry > 0) sb.append(carry);
        
        return sb.reverse().toString();
    }
    
    String minSum(int[] arr) {
        Arrays.sort(arr);
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        
        boolean flag = true;
        
        for(int ele : arr) {
            if(ele != 0) {
                if(flag) num1.append(ele + "");
                else num2.append(ele + "");
                flag = !flag;
            }
        }
        
        String n1 = num1.reverse().toString();
        String n2 = num2.reverse().toString();
        
        String res = getSum(n1,n2);
        return res;
    }
}
