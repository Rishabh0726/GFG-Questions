class Solution {
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n=val.length;
        int[][]dp=new int[n][capacity+1];

        for(int[]arr : dp){
            Arrays.fill(arr, -1);
        }

        return profit(capacity,val, wt, 0, dp);
    }
    public int profit(int W, int[] val, int[] wt, int i, int[][] dp){

        if(i==wt.length) return 0;
        if(dp[i][W]!=-1)return dp[i][W];

        int skip=profit(W, val, wt, i+1, dp);

        if(wt[i]>W){
            return dp[i][W]=skip;
        }

        int pick= val[i]+profit(W-wt[i], val, wt, i, dp);

        return dp[i][W]=Math.max(pick, skip);
    }
}