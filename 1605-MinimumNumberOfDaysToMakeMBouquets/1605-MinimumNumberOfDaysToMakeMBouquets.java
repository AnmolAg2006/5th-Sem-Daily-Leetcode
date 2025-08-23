// Last updated: 8/23/2025, 10:26:58 PM
class Solution {
    public static boolean isPossible(int[] bloomDay, int m, int k, int mid) {
        int c = 0;
        for (int i : bloomDay) {
            if (i <= mid) {
                c++;
                if (c == k) {
                    m--;
                    c=0;
                    if(m==0)
                    {
                        return true;
                    }
                }
            } else {
                c = 0;
            }
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        int s = 0;
        int ans=-1;
        int e = Integer.MIN_VALUE;
        for(int i:bloomDay)
        {
            e=Math.max(e,i);
        }
        while (s <= e) {
            int mid = (s + e) / 2;
            if (isPossible(bloomDay, m, k, mid)) {
                e=mid-1;
                ans=mid;
            } else {
                s=mid+1;
            }
        }
        return ans;
    }
}