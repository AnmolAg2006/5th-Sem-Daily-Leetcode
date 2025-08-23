// Last updated: 8/23/2025, 10:24:13 PM
class Solution {
    public static boolean isValid(String s, int i, int j, int k) {
        int z = 0;
        int o = 0;
        for (int idx = i; idx <= j; idx++) {
            if (s.charAt(idx) == '0') z++;
            else o++;
        }
        return (z <= k || o <= k);
    }
    public int countKConstraintSubstrings(String s, int k) {
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int o=0,z=0;
            for(int j=i;j<n;j++)
            {
                if(s.charAt(j)=='0') z++;
                else o++;
                if(z>k && o>k)
                {
                    break;
                }
                ans++;
            }
        }
        return ans;
    }
}