// Last updated: 8/6/2025, 4:02:54 PM
class Solution {
    public static void dfs(int[][] isConnected, boolean vis[], int curr) {
        vis[curr] = true;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[curr][i] == 1) {
                if(!vis[i])
                {

                dfs(isConnected, vis, i);
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int V=isConnected.length;
        boolean vis[]=new boolean[V];
        int ans=0;
        for(int i=0;i<V;i++)
        {
            if(!vis[i]){
                    dfs(isConnected,vis,i);
                    ans++;
                }
        }return ans;
            }

}