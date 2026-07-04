class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        for(int[] arr : mat){
            for(int a : arr){
                pq.add(a);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.remove());
        }
        return list;
    }
}