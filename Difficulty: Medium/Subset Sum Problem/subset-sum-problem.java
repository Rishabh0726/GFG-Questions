class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        // here Sum is varying from sum to 0 (length=sum+1)
        // and array index is varying from 0 to n-1 (length=n)
        // therefore we have to make 2D DP to memoize the answers
        
        Boolean[][]dp=new Boolean[arr.length][sum+1];
        return hasSubset(arr, sum, 0, dp);
    }
    
    static boolean hasSubset(int[]arr, int sum, int i, Boolean[][]dp){
        
        if(i==arr.length){
            if(sum==0)return true;
            return false;
        }
        if(dp[i][sum]!=null)return dp[i][sum];
        
        boolean skip=hasSubset(arr, sum, i+1, dp);
        
        //ye line tabhi ke liye hai jab (arr[i]>=0 all i from 0 to n-1)
        if(sum-arr[i]<0)return dp[i][sum]=skip;  
        boolean pick=hasSubset(arr, sum-arr[i], i+1, dp);
        return dp[i][sum]= (pick || skip);
    }
}