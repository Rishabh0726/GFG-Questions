class Solution {
    public int derangeCount(int n) {
        // code here
        if(n<=3)return n-1;
        int[]dp=new int[n+1];
        dp[1]=0;
        dp[2]=1;
        dp[3]=2;
        for(int i=4; i<=n; i++){
            dp[i]=(i-1)*(dp[i-1]+dp[i-2]);
        }
        return dp[n];
    }
};