class Solution {
    int n,m;
    public int numIslands(char[][] grid) {
        n=grid.length;m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(i,j,grid);
                }
            }
        }
        return ans;
    }
    public void dfs(int i,int j,char[][] grid){
        grid[i][j]='2';
        if(i>0 && grid[i-1][j]=='1') dfs(i-1,j,grid);
        if(i<n-1 && grid[i+1][j]=='1') dfs(i+1,j,grid);
        if(j>0 && grid[i][j-1]=='1') dfs(i,j-1,grid);
        if(j<m-1 && grid[i][j+1]=='1') dfs(i,j+1,grid);
    }
}
