// Last updated: 11/22/2025, 7:08:54 PM
class Solution {
    public static boolean isItPossible(int p[],int m,int k)
    {
        int c=1;
        int prev=p[0];
        for(int i=1;i<p.length;i++)
        {
            if(p[i]-prev>=k)
            {
                prev=p[i];
                c++;
                if(c==m) return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lo=1;
        int hi=(position[position.length-1]-position[0])/(m-1);
        int ans=1;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(isItPossible(position,m,mid))
            {
                ans=mid;
                lo=mid+1;
            } else {
                hi=mid-1;
            }
        }
        return ans;
    }
}