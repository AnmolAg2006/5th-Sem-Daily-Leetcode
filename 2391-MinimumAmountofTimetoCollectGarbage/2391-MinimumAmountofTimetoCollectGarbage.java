// Last updated: 10/22/2025, 12:44:20 AM
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n=garbage.length;
        int tot=0;
        for(String g: garbage)
        {
            tot+=g.length();
        }
        int lastm=0,lastp=0,lastg=0;
        for (int i = 0; i < n; i++) {
            if (garbage[i].contains("M")) lastm = i;
            if (garbage[i].contains("P")) lastp = i;
            if (garbage[i].contains("G")) lastg = i;

        }
         int[] prefix = new int[n];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + travel[i - 1];
        }
        int totalTime = tot 
                        + prefix[lastm] 
                        + prefix[lastp] 
                        + prefix[lastg];

        return totalTime;

    }
}