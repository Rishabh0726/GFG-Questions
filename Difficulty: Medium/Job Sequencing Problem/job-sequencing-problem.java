class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        ArrayList<int[]> jobs=new ArrayList<>();
        for(int i=0; i<deadline.length; i++){
            jobs.add(new int[]{profit[i], deadline[i]});
        }
        jobs.sort((a, b) -> Integer.compare(b[0], a[0]));
        
        int n = deadline.length;
        int[] parent = new int[n + 1];
        for(int i = 0; i <= n; i++){
            parent[i] = i;
         }
        int count=0;
        int totalProfit=0;
        for (int i = 0; i < n; i++) {
            int availableSlot = find(jobs.get(i)[1], parent);
            if(availableSlot > 0){
              count++;
              totalProfit += jobs.get(i)[0];
              parent[availableSlot] = find(availableSlot - 1, parent);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(count);
        ans.add(totalProfit);
        return ans;
    }
    
    private int find(int x, int[] parent){
       if(parent[x] == x){
         return x;
        }
        return parent[x] = find(parent[x], parent);
    }
}