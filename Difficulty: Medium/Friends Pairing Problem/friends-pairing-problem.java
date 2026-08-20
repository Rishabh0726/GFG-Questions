class Solution {
    public int countFriendsPairings(int n) {
        
        //tabulation
        if(n<=2)
        return n;
        int[]dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3; i<=n; i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
        
        //recursive code
        //if(n<=2)return n;
        //return countFriendsPairings(n-1)+(n-1)*countFriendsPairings(n-2);
        
        
        //memoization
        //int[]dp=new int[n+1];
        //Arrays.fill(dp, -1);
        //return pairing(n, dp);
    }
    //memoization
    //private int pairing(int n, int[]dp){
        //if(n<=2)return n;
        //if(dp[n]!=-1)return dp[n];
        //return dp[n]=pairing(n-1,dp)+(n-1)*pairing(n-2,dp);
    //}
}
