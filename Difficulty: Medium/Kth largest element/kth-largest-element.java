class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        // Your code here
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int a : arr){
            pq.add(a);
            if(pq.size()>k)
            pq.remove();
        }
        return pq.peek();
    }
}