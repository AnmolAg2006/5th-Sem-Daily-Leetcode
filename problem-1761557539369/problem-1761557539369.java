// Last updated: 10/27/2025, 3:02:19 PM
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n=queries.length;
        int ans[]=new int[n];
        HashMap<Integer,Integer>hm1=new HashMap<>();
        HashMap<Integer,Integer>hm2=new HashMap<>();
        int c=0;
        for(int i=0;i<n;i++)
        {
            int ball=queries[i][0];
            int col=queries[i][1];
            if(hm1.containsKey(queries[i][0]))
            {
                int curr=hm1.get(ball);
                hm2.put(curr,hm2.get(curr)-1);
                if(hm2.get(curr)==0) {
                    hm2.remove(curr);
                }
                hm1.put(ball,col);
                hm2.put(col,hm2.getOrDefault(col,0)+1);
            } else {
                hm1.put(ball,col);
                hm2.put(col,hm2.getOrDefault(col,0)+1);
            }
            ans[i]=hm2.size();
        }
        return ans;
    }
}