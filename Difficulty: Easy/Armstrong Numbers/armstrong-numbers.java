// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int cmp=n;
        int original=n;
        int cnt=0;
        while (n!=0){
            n= n/10;
            cnt++;
        }
        int sum=0;
        for (int i=0; i<cnt; i++){
            int r=original%10;
            sum= (int) (sum+Math.pow(r, cnt));
            original=original/10;
        }
        return sum==cmp;
    }
}