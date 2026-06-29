class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
        int n=maze[0].length;
        boolean[][] visited=new boolean[n][n];
        solve(maze, 0,0, "", ans, visited);
        return ans;
    }
    private void solve(int[][]maze, int r, int c, String path, ArrayList<String>ans, boolean[][]visited){
        int n=maze[0].length;
        if(r<0 || c<0 || c>=n || r>=n || maze[r][c]==0 || visited[r][c]==true){
            return;
        }
        if(r==n-1 && c==n-1){
            ans.add(path.toString());
            return;
        }
        visited[r][c]=true;
        
        solve(maze, r+1, c, path+"D", ans, visited);
        solve(maze, r, c-1, path+"L", ans, visited);
        solve(maze, r, c+1, path+"R", ans, visited);
        solve(maze, r-1, c, path+"U", ans, visited);
        
        visited[r][c]=false;
    }
}