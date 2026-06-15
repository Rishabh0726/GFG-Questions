class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        ArrayList<int[]> meetings=new ArrayList<>();
        
        for(int i=0; i<start.length; i++){
            meetings.add(new int[]{start[i], finish[i], i+1});
        }
        
        meetings.sort(Comparator.comparingInt(a -> a[1]));
        
        ArrayList<Integer> answer=new ArrayList<>();
        int endTime=-1;
        
        for(int[]m: meetings){
            if(m[0]>endTime){
                answer.add(m[2]);
                endTime=m[1];
            }
        }
        
        return answer.size();
    }
}
