// Last updated: 8/23/2025, 10:27:22 PM
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>hs1=new HashSet<>();
        HashSet<Integer>hs2=new HashSet<>();
        for(int i:nums1)
        {
            hs1.add(i);
        }
        for(int i:nums2)
        {
            hs2.add(i);
        }
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>arr1=new ArrayList<>();
        List<Integer>arr2=new ArrayList<>();
        for(int i:hs1)
        {
            if(!hs2.contains(i))
            {
                arr1.add(i);
            }
        }
        ans.add(arr1);
        for(int i:hs2)
        {
            if(!hs1.contains(i))
            {
                arr2.add(i);
            }
        }
        ans.add(arr2);
        return ans;
    }
}