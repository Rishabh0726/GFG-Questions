class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int low=0;
        int high=0;
        for(int a : arr){
            low=Math.max(low, a);
            high+=a;
        }
        int ans=low;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canPainted(arr, mid, k)){
                ans=mid;
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean canPainted(int[] arr, int capacity, int k){
        int painter=1;
        int paint=0;
        for(int i=0; i<arr.length; i++){
            if(paint+arr[i]<=capacity)
            paint+=arr[i];
            else{
                painter++;
                paint=arr[i];
            }
            if(painter>k)
            return false;
        }
        return true;
    }
}
