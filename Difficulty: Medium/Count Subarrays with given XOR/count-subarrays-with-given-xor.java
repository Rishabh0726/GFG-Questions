class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1);
        int cnt=0;
        int xor=0;
        for(int num : arr){
            xor=xor^num;
            int needed=xor^k;
            if(map.containsKey(needed)){
                cnt=cnt+map.get(needed);
            }
            map.put(xor, map.getOrDefault(xor, 0)+1);
        }
        return cnt;
    }
}