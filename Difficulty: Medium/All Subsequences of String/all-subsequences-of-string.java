class Solution {
    public List<String> powerSet(String s) {
        // Code here
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder output= new StringBuilder();
        int index=0;
        getSubsequences(ans, s, output, index);
        Collections.sort(ans);
        return ans;
    }
    private void getSubsequences(ArrayList<String> ans, String s, StringBuilder output, int index){
        if(index==s.length()){
            ans.add(output.toString());
            return;
        }
        getSubsequences(ans, s, output, index+1);
        getSubsequences(ans, s, output.append(s.charAt(index)), index+1);
        output.deleteCharAt(output.length() - 1);
    }
}