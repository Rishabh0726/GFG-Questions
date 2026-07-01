class Solution {
    public int median(int[][] mat) {
        // code here
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        
        int m=mat.length;
        int n=mat[0].length;
        int req=(m*n)/2;
        
        for(int i=0; i<m; i++){
            low=Math.min(low, mat[i][0]);
            high=Math.max(high, mat[i][n-1]);
        }
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            int get=getCounts(mat, m, n, mid);
            
            if(get<=req){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    
    private int getCounts(int[][]mat, int m, int n, int x){
        int cnt=0;
        for(int i=0; i<m; i++){
            cnt+=upperBound(mat[i], n, x);
        }
        return cnt;
    }
    private int upperBound(int[] arr, int n, int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}