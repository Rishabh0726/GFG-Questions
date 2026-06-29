class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
        // code here
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u=edge[0];
            int x=edge[1];
            graph.get(u).add(x);
            graph.get(x).add(u);
        }
        int[] colour= new int[v];
        
        return colourGraph(graph, 0, colour, v, m );
        
    }
    
    private boolean colourGraph(ArrayList<ArrayList<Integer>>graph, int node, int[]colour, int v, int m){
        if(node==v)
        return true;
        
        for(int i=1; i<=m; i++){
            if(isSafe(graph, node, colour, i)){
                colour[node]=i;
                if(colourGraph(graph, node+1, colour, v, m))
                return true;
                colour[node]=0;
            }
        }
        return false;
    }
    
    private boolean isSafe(ArrayList<ArrayList<Integer>>graph, int node, int[] colour, int col){
        for(int list : graph.get(node)){
            if(colour[list]==col)
            return false;
        }
        return true;
    }
    
}