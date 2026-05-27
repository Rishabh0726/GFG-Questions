// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> ans= new ArrayList<>();
        allCombinations(ans, 0, s, "");
        Collections.sort(ans);
        return ans;
    }
    
    private void allCombinations(List<String> ans, int index, String s, String curr){
        if(index== s.length()){
            if(curr.length()>0){
                ans.add(curr);
            }
            return;
        }
        
        allCombinations(ans, index+1, s, curr+s.charAt(index));
        
        allCombinations(ans, index+1, s, curr);
            
    }
}