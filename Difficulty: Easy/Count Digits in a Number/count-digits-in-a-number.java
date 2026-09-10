class Solution {
    public static int countDigits(int n) {
        // Code here
        int q=n/10;
        if(q==0)
        return 1;
        int cnt=1;
        while(q!=0){
            q=q/10;
            cnt++;
        }
        return cnt;
        
    }
}
