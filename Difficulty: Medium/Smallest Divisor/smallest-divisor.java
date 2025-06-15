class Solution {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        long sum=0;
        for(int item:arr) sum+=item;
        long left=1,right=Arrays.stream(arr).max().getAsInt();
        while(left<=right)
        {
            int mid=(int)(left+(right-left)/2);
            if(sum(arr,mid)<=k){
                right=mid-1;
            }
            else left=mid+1;
        }
        return (int)left;
        
        
    }
    // it is bimary search problem
    public long sum(int [] arr,int k)
    {
        long sum=0l;
        for(int item:arr)
        {
            sum+=Math.ceil((double)item/k);
        }
        return sum;
    }
}