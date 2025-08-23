// Last updated: 8/23/2025, 10:29:18 PM
    class Solution {
        public static boolean isPossible(int citations[],int k)
        {
            int c=k;
            for(int i=citations.length-1;i>=0;i--)
            {
                if(citations[i]>=k)
                {
                    c--;
                }
                else{
                    break;
                }
            }
            return c<=0;
        }
        public int hIndex(int[] citations) {
            int s = 0;
            int e = citations.length;
            int ans=0;
            while (s <= e) {
                int mid = (s + e) / 2;
                if (isPossible(citations, mid)) {
                    s = mid + 1;
                    ans=mid;
                } else {
                    e = mid - 1;
                }
            }
            return ans;
        }
    }