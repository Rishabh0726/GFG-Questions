// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,-1);
        int maxLength=0;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==k)
            maxLength= Math.max(maxLength, i+1);
            
            int rem=sum-k;
            if(map.containsKey(rem)){
                int length=i-map.get(rem);
                maxLength=Math.max(length, maxLength);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}
