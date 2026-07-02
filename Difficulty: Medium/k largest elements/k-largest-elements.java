class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue <Integer> pq= new PriorityQueue<>();
        for(int a: arr){
            pq.add(a);
            if(pq.size()>k)
            pq.remove();
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll());
        }
        Collections.reverse(list);
        return list;
    }
}
