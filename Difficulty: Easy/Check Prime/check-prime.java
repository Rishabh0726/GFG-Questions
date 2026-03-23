class Solution {
    public static boolean prime(int n) {
        if(n==1)
        return false;
        int cnt=0;
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt==1){
            return true;
        }else{
            return false;
        }
    }
}