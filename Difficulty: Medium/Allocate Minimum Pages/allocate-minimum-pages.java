class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length)
        return -1;
        int low=0;
        int high=0;
        int ans=0;
        for(int a : arr){
            low=Math.max(low, a);
            high=high+a;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canAllocate(arr, mid, k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean canAllocate(int[] arr, int maxPages, int k){
        int pages=0;
        int students=1;
        for(int i=0; i<arr.length; i++){
            if(pages+arr[i]<=maxPages)
            pages+=arr[i];
            else{
                students++;
                pages=arr[i];
            }
            if(students>k)
            return false;
        }
        return true;
    }
}