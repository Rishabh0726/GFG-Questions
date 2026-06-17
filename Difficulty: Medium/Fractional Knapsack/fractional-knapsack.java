class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        ArrayList<int[]> items=new ArrayList<>();
        for(int i=0; i<val.length; i++){
            items.add(new int[]{val[i], wt[i]});
        }
        items.sort((a,b) -> 
        Double.compare((double)b[0]/b[1],(double)a[0]/a[1]));
        
        double totalVal=0;
        for(int i=0; i<val.length; i++){
            if(items.get(i)[1]<=capacity){
                totalVal+=items.get(i)[0];
                capacity-=items.get(i)[1];
            }else{
                totalVal+=(1.0*items.get(i)[0]/items.get(i)[1])*capacity;
                break;
            }
        }
        return totalVal;
    }
}

