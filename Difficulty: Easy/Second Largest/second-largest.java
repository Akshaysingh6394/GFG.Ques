class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int secLar = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != max){
                if(arr[i] > secLar){
                    secLar = arr[i];
                }
            }
        }
        if(secLar == max) {
            return -1;
        }
        return secLar;
    }
}