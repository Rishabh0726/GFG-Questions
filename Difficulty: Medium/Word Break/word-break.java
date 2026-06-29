class Solution {
    public boolean wordBreak(String s, String[] dictionary) {
        // code here
        Set<String> set=new HashSet<>(Arrays.asList(dictionary));
        return solve(set, s);
    }
    
    private boolean solve(Set<String> set, String s){
        int maxLen=0;
        for(String v : set){
            maxLen=Math.max(maxLen, v.length());
        }
        
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        
        dp[0]=true;
        
        for(int i=1; i<=n; i++){
            for(int j=i-1; j>=Math.max(0, i-maxLen); j--){
                if(dp[j] && set.contains(s.substring(j, i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}