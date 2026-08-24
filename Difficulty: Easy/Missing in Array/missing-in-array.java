class Solution {
    int missingNum(int arr[]) {
        // code here
        long n=(long)arr.length+1;
        long maxsum=(n*(n+1))/2;
        long sum=0;
        for(int a : arr){
            sum+=a;
        }
        return(int)(maxsum-sum);
    }
}