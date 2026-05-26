class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty())
        return;
        
        int top=st.pop();
        
        reverseStack(st);
        
        reverse(st, top);
        
    }
    
    private static void reverse(Stack<Integer> st, int top){
        
        if(st.isEmpty()){
            st.push(top);
            return;
        }
        
        int x=st.pop();
        
        reverse(st, top);
        
        st.push(x);
    }
    
}
