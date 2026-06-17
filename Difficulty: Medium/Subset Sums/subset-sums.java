// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        getAllSubsets(arr, new ArrayList<Integer>(), ans, 0);
        return ans;
    }
    
    private void getAllSubsets(int[]nums, List<Integer>subset, List<Integer> result, int n){
        if(n==nums.length){
            result.add(subsetSum(new ArrayList<>(subset)));
            return;
        }
        subset.add(nums[n]);
        getAllSubsets(nums, subset, result, n+1);

        subset.remove(subset.size()-1);
        getAllSubsets(nums, subset, result, n+1);
    }
    
    private int subsetSum(List<Integer>subset){
        int sum=0;
        for(int s : subset){
            sum+=s;
        }
        return sum;
    }
}