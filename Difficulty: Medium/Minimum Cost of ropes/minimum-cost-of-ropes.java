class Solution {
    public static int minCost(int[] arr) {
        // code here
        int cost=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int a : arr){
            pq.add(a);
        }
        while(pq.size()>1){
            int temp=0;
            temp+=(pq.remove()+pq.remove());
            cost+=temp;
            pq.add(temp);
        }
        return cost;
    }
}