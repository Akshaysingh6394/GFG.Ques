class Solution {
    public static String maxSubseq(String s, int k) {
        // code here
         Deque<Character> stack = new ArrayDeque<>();
        int n = s.length();

        for (char ch : s.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peekLast() < ch) {
                stack.removeLast(); // pop smaller element
                k--;
            }
            stack.addLast(ch);
        }

        
        while (k > 0 && !stack.isEmpty()) {
            stack.removeLast();
            k--;
        }

         
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
}