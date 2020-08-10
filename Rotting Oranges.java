class Solution {

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        if( n == 0 ) return -1;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0 , min = 0;
        int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
		
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if( grid[i][j] == 1 ) fresh++;
                if( grid[i][j] == 2 ) q.add(new int[]{i,j});
            }
        }
		
        while( !q.isEmpty() && fresh > 0 ){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] cur = q.poll();
                for(int[] dir : dirs ){
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];
                    if( x >= 0 && y >= 0 && x < n && y < m && grid[x][y] == 1 ){
                        fresh--;
                        grid[x][y] = 2;
                        q.add(new int[]{x,y});
                    }
                }
            }
            min++;
        }
		
        return fresh==0?min:-1;    
    }
}