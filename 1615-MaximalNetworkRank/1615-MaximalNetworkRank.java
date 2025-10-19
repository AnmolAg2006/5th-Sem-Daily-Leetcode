// Last updated: 10/19/2025, 7:58:27 PM
import java.util.*;

class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        // Step 1: Degree array for each city
        int[] degree = new int[n];

        // Step 2: Adjacency list using HashSet (stores direct connections)
        HashSet<Integer>[] adj = new HashSet[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new HashSet<>();
        }

        // Step 3: Fill degree + adjacency info
        for (int[] r : roads) {
            int a = r[0], b = r[1];
            degree[a]++;
            degree[b]++;
            adj[a].add(b);
            adj[b].add(a);
        }

        // Step 4: Try all pairs of cities (i, j)
        int maxRank = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int rank = degree[i] + degree[j];
                // subtract 1 if directly connected
                if (adj[i].contains(j)) rank--;
                maxRank = Math.max(maxRank, rank);
            }
        }

        return maxRank;
    }
}
