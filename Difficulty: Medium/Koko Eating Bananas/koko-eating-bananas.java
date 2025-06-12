class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int l=1;
        int r=arr[arr.length-1];
        
        
        while(l<r){
            int mid=l+(r-l)/2;
            
            if(!possible(arr,mid,k)){ // if not Possible than definitely the answer is big
                l=mid+1;
            }
            else{
                // if possible than try to find a lower answer but note r can also be an answer
                r=mid;
            }
        }
        return l;
    }
    boolean possible(int arr[],int rate,int k){
        int ans=0;
        for(var a:arr ){
            ans+=Math.ceil(a/(rate*1.0));
            if(ans>k) return false;
        }
        return true;
    }
}
