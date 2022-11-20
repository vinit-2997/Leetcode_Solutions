class Solution {
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        int components = 0;
        
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(grid[i][j] == '1')
                {
                    components++;
                    helper(grid, i, j, m, n);
                }
            }
        }
        
        return components;
        
    }
    
    void helper(char[][] grid, int i, int j, int m, int n)
    {
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] == '0')
        {
            return;
        }
        
        grid[i][j] = '0';
        
        helper(grid, i-1, j, m, n);
        helper(grid, i+1, j, m, n);
        helper(grid, i, j-1, m, n);
        helper(grid, i, j+1, m, n);
        
    }
}