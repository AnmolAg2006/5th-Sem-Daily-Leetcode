// Last updated: 8/23/2025, 10:27:55 PM
class Solution {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void bfs(List<List<Integer>> rooms,int curr,boolean vis[])
    {
        vis[curr]=true;
        for(int i=0;i<rooms.get(curr).size();i++)
        {
            if(!vis[rooms.get(curr).get(i)])
            {

            bfs(rooms,rooms.get(curr).get(i),vis);
            }
        }
    } 
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean vis[]=new boolean [rooms.size()];
        bfs(rooms,0,vis);
        for(boolean val:vis)
        {
            if(val==false)
            {
                return false;
            }
        }
        return true;
    }
}