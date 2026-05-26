class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty())
        return;
        
        int top=st.pop();
        
        sortStack(st);
        
        insertSorted(st, top);
    }
    
    private void insertSorted(Stack<Integer> st, int x){
        
        if(st.isEmpty() || st.peek()<=x){
            st.push(x);
            return;
        }
        
        int top=st.pop();
        
        insertSorted(st, x);
        
        st.push(top);
        
    }
}