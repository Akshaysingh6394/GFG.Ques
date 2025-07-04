class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        if (arr == null || k < 0) {
            return 0;
        }
        int length = arr.length;
        int count = 0;
        int left = 0;
        int right = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        while (right < length) {
            int rightChar = arr[right];
            freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);
            while (freqMap.size() > k) {
                int leftChar = arr[left];
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                if (freqMap.get(leftChar) == 0) {
                    freqMap.remove(leftChar);
                }
                left++;
            }
            count += (right - left + 1);
            right++;
        }
        return count;
    }
}
