// Last updated: 8/23/2025, 10:28:41 PM
class Solution {
    public static boolean isPossible(int houses[], int heaters[], int mid) {
        int i=0;
        int j=0;
        int n=houses.length;
        int m=heaters.length;
        while(i<n && j<m)
        {
            while(i<n && (heaters[j]+mid>=houses[i]&&heaters[j]-mid<=houses[i]))
            {
                i++;
            }
            j++;
        }
        return i==n;
    }

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int l = 0;
        int h = houses[houses.length - 1] - houses[0];
        int ans=heaters[heaters.length-1]-houses[0];
        while (l <= h) {
            int mid = (l + h) / 2;
            if (isPossible(houses, heaters, mid)) {
                ans=mid;
                h = mid-1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}