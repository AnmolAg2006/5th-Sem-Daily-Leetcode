// Last updated: 11/19/2025, 12:34:33 PM
class Solution {
    public int longestCycle(int[] edges) {

        int in[] = new int[edges.length];
        for (int i = 0; i < edges.length; i++) {
            if (edges[i] != -1) {
                in[edges[i]]++;
            }
            // in[(edges[i]==-1)?0:edges[i]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0)
                q.add(i);
        }
        HashSet<Integer> hs = new HashSet<>();
        while (!q.isEmpty()) {
            int e = q.poll();
            hs.add(e);
            if (edges[e] != -1) {
                if (--in[edges[e]] == 0) {
                    q.add(edges[e]);
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < edges.length; i++) {
            if (!hs.contains(i)) {
                int c = 1;
                hs.add(i);
                int nbrs = edges[i];
                while (nbrs != i) {
                    c++;
                    hs.add(nbrs);
                    nbrs = edges[nbrs];
                }
                ans = Math.max(c, ans);
            }
        }
        return ans;
    }

}