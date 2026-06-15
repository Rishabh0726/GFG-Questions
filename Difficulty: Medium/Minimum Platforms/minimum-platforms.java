class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int maxCnt=0;
        int cnt=0;
        int i=0, j=0;
        while(i<arr.length){
            if(arr[i]<=dep[j]){
                cnt+=1;
                i++;
            }else{
                cnt-=1;
                j++;
            }
            maxCnt=Math.max(cnt, maxCnt);
        }
        return maxCnt;
    }
}
