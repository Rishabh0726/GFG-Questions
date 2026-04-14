class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low=0;
        int high=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=nRoot(mid, n);
            if(ans==m)
            return mid;
            else if(ans<m)
            low=mid+1;
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    private int nRoot(int num, int pow){
        int ans=1;
        for(int i=0; i<pow; i++){
            ans=ans*num;
        }
        return ans;
    }
}