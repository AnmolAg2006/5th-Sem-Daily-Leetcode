// Last updated: 8/23/2025, 10:29:06 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hs=new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }
        ArrayList<Integer>ans1=new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(hs.contains(nums2[i]))
            {
                ans1.add(nums2[i]);
                hs.remove(nums2[i]);
            }
        }
        int ans[]=new int[ans1.size()];
        for (int i = 0; i < ans1.size(); i++) {
            ans[i]=ans1.get(i);
        }
        return ans;
    }
}