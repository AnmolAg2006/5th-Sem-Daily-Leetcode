// Last updated: 8/23/2025, 10:25:09 PM
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap <Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!h.containsKey(nums1[i][0]))
            {
                h.put(nums1[i][0], nums1[i][1]);
            }
            else{
                h.put(nums1[i][0], nums1[i][1]+h.get(nums1[i][0]));
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(!h.containsKey(nums2[i][0]))
            {
                h.put(nums2[i][0], nums2[i][1]);
            }
            else{
                h.put(nums2[i][0], nums2[i][1]+h.get(nums2[i][0]));
            }
        }
        int ans[][]=new int[h.size()][2];
        int j=0;
        for (int i :h.keySet()) {
            
            ans[j][0]=i;
            ans[j++][1]=h.get(i);
        }
        Arrays.sort(ans, (a, b) -> Integer.compare(a[0], b[0]));

        return ans;
    }
}