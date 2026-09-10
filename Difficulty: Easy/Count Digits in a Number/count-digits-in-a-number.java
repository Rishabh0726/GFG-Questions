class Solution {
    public static int countDigits(int n) {
        // Code here
        int cnt=0;
        while(n!=0){
            n=n/10;
            cnt++;
        }
        return cnt;
        
    }
}
