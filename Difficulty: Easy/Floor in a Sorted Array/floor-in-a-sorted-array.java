class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        if(arr[0]>x)
        return -1;
        
        int s=0;
        int e=arr.length-1;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<=x){
                ans=mid;
                s=mid+1;
            }
            else e=mid-1;
        }
        return ans;
    }
}
