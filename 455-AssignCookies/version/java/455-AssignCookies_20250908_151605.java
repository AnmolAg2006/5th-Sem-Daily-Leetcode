// Last updated: 9/8/2025, 3:16:05 PM
class Solution {
    public int findContentChildren(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int ans=0;
        int j=0;
        int i=0;
        while(i<players.length && j<trainers.length)
        {
            if(players[i]<=trainers[j]) {
                ans++;
                i++;
            }
                j++;
        }
        return ans;
    }
}