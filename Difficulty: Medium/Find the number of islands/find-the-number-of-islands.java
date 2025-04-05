//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] grid = new char[n][m];

            // Read the grid input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.next().charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.countIslands(grid);
            System.out.println(ans);
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    private void bfs(int ro, int co, int [][] vis, char[][]grid){
        vis[ro][co]=1;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(ro,co));
        int n=grid.length;
        int m=grid[0].length;
        
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            
            for(int delrow=-1;delrow<=1;delrow++){
                for(int delcol=-1;delcol<=1;delcol++){
                    int nrow=row+delrow;
                    int ncol=col+delcol;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
                    && grid[nrow][ncol]=='L' && vis[nrow][ncol]==0){
                        vis[nrow][ncol]= 1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
    }
    public int countIslands(char[][] grid) {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int [][] vis=new int[n][m];
        int cnt=0;
        for(int row=0;row<n; row++){
            for(int col=0;col<m; col++){
                if(vis[row][col]==0 && grid[row][col]=='L'){
                    cnt++;
                    bfs(row,col,vis,grid);
                }
            }
        }
        return cnt;
    }
}

